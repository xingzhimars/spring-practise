package com.mars.practise.spring.exception.common;

/**
 * 异常基础类
 * Created by geyan on 2025/4/2 21:16
 */
public class BusinessException extends RuntimeException {

    private final int errorCode;
    private final String errorMessage;

    public BusinessException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
