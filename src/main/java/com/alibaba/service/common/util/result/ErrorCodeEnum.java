package com.alibaba.service.common.util.result;


public enum ErrorCodeEnum {

    /**
     * 系统错误
     */
    SYSTEM_ERROR("system_error"),
    /**
     * 无权限
     */
    NO_PERMISSION("no_permission"),
    /**
     * 参数无效
     */
    INVALID_PARAM("invalid_param"),
    /**
     * 结果为空
     */
    ENTRY_MISSING("entry_missing"),
    /**
     * 安全拦截
     */
    SECURITY_INTERCEPT("security_intercept");



    ErrorCodeEnum(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorCode;

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
