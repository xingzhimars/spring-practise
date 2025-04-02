package com.mars.practise.spring.exception.common;

/**
 * Created by geyan on 2025/4/2 21:17
 */
public class UserNotFoundException extends BusinessException {

    private static final int ERR_CODE = 10000;

    public UserNotFoundException(String username) {
        super(ERR_CODE, "用户不存在: " + username);
    }

}

