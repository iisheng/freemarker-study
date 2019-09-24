package com.example.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author iisheng
 * @date 2019/09/11 11:21:06
 */
@Builder
@Data
public class NewsDO {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 封面图url
     */
    private String coverImgUrl;
    /**
     * 标题
     */
    private String title;
    /**
     * 概要
     */
    private String summary;
    /**
     * 内容
     */
    private String content;
    /**
     *
     */
    private NewsEnum type;
    /**
     * 发布时间
     */
    private Date publishTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
}
