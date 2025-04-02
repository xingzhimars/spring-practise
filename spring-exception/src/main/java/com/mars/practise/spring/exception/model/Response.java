package com.mars.practise.spring.exception.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by geyan on 2025/4/2 21:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {

    private int code;

    private String msg;

    private T data;


    public static <T> Response<T> success(T data) {
        return new Response<>(0, "success", data);
    }

    public static <T> Response<T> fail(int code, String msg) {
        return new Response<>(code, msg, null);
    }
}
