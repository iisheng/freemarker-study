package com.example.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author iisheng
 * @date 2019/09/20 14:38:46
 */
@Data
@Builder
public class CaseDetailModel {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 发布时间
     */
    private Date publishTime;
    /**
     * 自增id
     */
    private Long leftId;
    private String description;
    /**
     * 自增id
     */
    private Long rightId;
    /**
     * 标题
     */
    private String title;

    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 服务内容
     */
    private String serviceContent;
    /**
     * 分类
     */
    private String type;
    private String colorModel;
    /**
     * 图片
     */
    private String image;
}
