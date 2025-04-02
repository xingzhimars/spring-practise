package com.mars.practise.spring.exception.common;

/**
 * Created by geyan on 2025/4/2 21:19
 */
public class InvalidPasswordException extends BusinessException {

    private static final int ERR_CODE = 10001;

    public InvalidPasswordException(String username) {
        super(ERR_CODE, "密码错误: " + username);
    }
}
