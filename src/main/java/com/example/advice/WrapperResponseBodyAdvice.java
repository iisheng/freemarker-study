package com.example.advice;

import com.example.entity.ResponseBean;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author iisheng
 * @date 2019/09/22 23:18:59
 */
@ControllerAdvice
public class WrapperResponseBodyAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        ResponseBean responseBean = ResponseBean.builder()
                .data(o)
                .code(200)
                .message("操作成功")
                .build();
        return responseBean;
    }
}
