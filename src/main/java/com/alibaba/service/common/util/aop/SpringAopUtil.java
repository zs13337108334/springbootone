package com.alibaba.service.common.util.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.service.common.util.result.BaseResult;
import com.alibaba.service.common.util.result.BaseResultGenerator;
import com.alibaba.service.common.util.result.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;


/**
 * @author zhansghuai
 * @date 2022/12/01
 */
@Aspect
@Component
@Slf4j
public class SpringAopUtil {
    // 切入点：待增强的方法
    @Pointcut("execution(public * com.alibaba.controller.*.*(..))")

    //切入点签名
    public void log() {
        System.out.println("pointCut签名。。。");
    }

    // 前置通知 （切入点方法之前执行 用于查看请求）
    @Before("log()")
    public void deBefore(JoinPoint jp) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        if (StringUtils.isEmpty(request.getRequestURL())) {
            BaseResult<Object> result = BaseResultGenerator.genError(ErrorCodeEnum.SYSTEM_ERROR.getErrorCode(), "系统错误");
            log.error("deBefore result:{}", JSON.toJSONString(result));
            return;
        }
        log.info("url: " + request.getRequestURL().toString());
        log.info("http请求方式: " + request.getMethod());
        log.info("方法名 : " + jp);
        log.info("==========================================================");

        // 安全拦截"url: http://127.0.0.1:8080/springboot/order 发布服务器后取消此校验
        String url = request.getRequestURL().toString();
        if (!url.contains("127.0.0.1")) {
            BaseResult<Object> result = BaseResultGenerator.genError(ErrorCodeEnum.SECURITY_INTERCEPT.getErrorCode(), "安全拦截");
            log.error("deBefore result:{}", JSON.toJSONString(result));
            return;
        }


    }
}
