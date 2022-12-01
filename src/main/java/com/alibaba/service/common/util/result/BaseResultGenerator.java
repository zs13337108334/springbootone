package com.alibaba.service.common.util.result;


import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author hengming.lhm
 * @date 2018/8/23
 *
 * ResultDataGenerator, For 简化代码
 */
@Component
public class BaseResultGenerator {

    public static BaseResult<Boolean> genSuccess() {
        BaseResult<Boolean> result = new BaseResult<>();
        result.setSuccess(true);
        result.setResult(Boolean.TRUE);
        return result;
    }

    public static <T> BaseResult<T> genSuccess(T data) {
        BaseResult<T> result = new BaseResult<>();
        result.setSuccess(true);
        result.setResult(data);
        return result;
    }

    public static <T> BaseResult<T> genError(String errCode, String errMessage) {
        BaseResult<T> result = new BaseResult<>();
        result.setSuccess(false);
        result.setErrorCode(errCode);
        result.setErrorMsg(errMessage);
        return result;
    }

    public static <T> BaseResult<T> genError(String errCode) {
        BaseResult<T> result = new BaseResult<>();
        result.setSuccess(false);
        result.setErrorCode(errCode);
        result.setErrorMsg("errMessage");
        return result;
    }

    public static <T> BaseResult<T> genError(ErrorCodeEnum errorCodeEnum, String errMessage) {
        return genError(errorCodeEnum.getErrorCode(), errMessage);
    }

    public static <T> BaseResult<T> genError(BaseResult errorResult) {
        return genError(errorResult.getErrorCode(), errorResult.getErrorMsg());
    }

}
