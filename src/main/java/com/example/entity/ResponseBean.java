package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author iisheng
 * @date 2019/09/22 23:15:15
 */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class ResponseBean<T> {
    private int code;
    private String message;
    private T data;
}
