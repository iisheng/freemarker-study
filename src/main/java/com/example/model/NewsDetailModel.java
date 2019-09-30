package com.example.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author iisheng
 * @date 2019/09/30 16:32:50
 */
@Data
@Builder
public class NewsDetailModel {
    private String title;
    /**
     * 发布时间
     */
    private Date publishTime;
    /**
     * 概要
     */
    private String summary;
    /**
     * 内容
     */
    private String content;
    private Long id;
    private Long rightId;
    private Long leftId;
}
