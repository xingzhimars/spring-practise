package com.mars.practise.spring.exception.dao;

import com.mars.practise.spring.exception.model.User;

/**
 * Created by geyan on 2025/4/2 21:19
 */
public interface UserRepository {

    User findUserByUsername(String username);
}
