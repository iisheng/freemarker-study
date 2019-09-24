package com.example.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author iisheng
 * @date 2019/09/20 14:38:46
 */
@Data
@Builder
public class CaseModel {
    /**
     * 自增id
     */
    private Long id;
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
    /**
     * 图片
     */
    private String image;
}
