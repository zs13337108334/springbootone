package com.alibaba.service.common.util.result;


import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 *   @author zhangshuai
 *   @date   2022/12/01
 * 返回值封装类
 * @param <T>
 */
public class BaseResult<T> implements Serializable {


    private static final long serialVersionUID = 1209592613503400268L;

    private boolean success = true;

    private T result;

    private String errorMsg;

    private String errorCode;


    public BaseResult() {
    }

    public BaseResult(T result) {
        this.result = result;
    }

    public boolean getIsSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        if (!StringUtils.isEmpty(errorMsg)) {
            success = false;
        }

        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        if (!StringUtils.isEmpty(errorCode)) {
            success = false;
        }

        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "success=" + success +
                ", result=" + result +
                ", errorMsg='" + errorMsg + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
