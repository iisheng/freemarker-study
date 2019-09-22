package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author iisheng
 * @date 2019/09/23 00:42:01
 */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class PageUtil<T> {
    T record;
    int totalPage;
    int cursor;
}
