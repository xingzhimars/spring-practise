package com.mars.practise.spring.exception.service;

import com.mars.practise.spring.exception.common.InvalidPasswordException;
import com.mars.practise.spring.exception.common.UserNotFoundException;
import com.mars.practise.spring.exception.dao.UserRepository;
import com.mars.practise.spring.exception.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by geyan on 2025/4/2 21:22
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {
        // 1. 检查用户是否存在
        User user = userRepository.findUserByUsername(username);
        if (user == null) {
            throw new UserNotFoundException(username);
        }

        // 2. 检查密码是否正确
        if (!user.getPassword().equals(password)) {
            throw new InvalidPasswordException(username);
        }

        return user;
    }
}