package com.mars.practise.spring.exception.dao;

import com.mars.practise.spring.exception.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geyan on 2025/4/2 21:21
 */

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final Map<String, User> users = new HashMap<>();

    static {
        users.put("user1", new User("user1", "123456"));
        users.put("user2", new User("user2", "abcdef"));
    }

    @Override
    public User findUserByUsername(String username) {
        return users.get(username);
    }
}