package com.example.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author iisheng
 * @date 2019/09/25 22:36:02
 */
@Builder
@Data
public class ADImage {
    /**
     * id
     */
    private Long id;
    /**
     * 广告图片url
     */
    private String imgUrl;
    /**
     * 广告图片类型 1  banner  2  合作商家
     */
    private int type;
}
