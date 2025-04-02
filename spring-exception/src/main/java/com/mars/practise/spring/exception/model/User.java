package com.mars.practise.spring.exception.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by geyan on 2025/4/2 21:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private String userName;

    private String password;
}
