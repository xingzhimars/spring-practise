package com.mars.practise.spring.exception.controller;

import com.mars.practise.spring.exception.common.BusinessException;
import com.mars.practise.spring.exception.model.LoginRequest;
import com.mars.practise.spring.exception.model.Response;
import com.mars.practise.spring.exception.model.User;
import com.mars.practise.spring.exception.model.UserResponse;
import com.mars.practise.spring.exception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by geyan on 2025/4/2 21:24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Response<UserResponse> login(@RequestBody LoginRequest request) {
        try {
            User user = userService.login(request.getUsername(), request.getPassword());


            UserResponse userResponse = new UserResponse(user.getUserName());

            return Response.success(userResponse);
        } catch (BusinessException e) {

            // 业务异常由全局处理
            throw e;
        }
    }
}
