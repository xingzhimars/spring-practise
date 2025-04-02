package com.mars.practise.spring.exception.handler;

import com.mars.practise.spring.exception.common.BusinessException;
import com.mars.practise.spring.exception.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by geyan on 2025/4/2 21:26
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BusinessException.class)
    // ResponseBody注解必须加，否则会一直异常
    @ResponseBody
    public Response<Object> handleBusinessException(BusinessException ex) {
        log.error(ex.getMessage());
        return Response.fail(ex.getErrorCode(), ex.getErrorMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response<Object> handleException(Exception ex) {
        log.error(ex.getMessage(), ex);
        return Response.fail(500, "服务器内部错误");
    }
}
