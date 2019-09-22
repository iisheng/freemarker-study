package com.example.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author iisheng
 * @date 2019/08/21 11:03:50
 */
@Builder
@Data
public class CaseDO {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 服务内容
     */
    private String serviceContent;
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
    /**
     * 分类
     */
    private CaseEnum type;
    /**
     * 颜色模式
     */
    private ColorEnum colorModel;
    /**
     * 封面图
     */
    private String coverImage;
    /**
     * 图片
     */
    private String image;
}
