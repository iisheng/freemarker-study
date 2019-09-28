package com.example.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/28 22:01:40
 */
@Data
@Builder
public class HomeModel {
    /**
     * 案例model 列表
     */
    private List<CaseModel> caseModels;
    /**
     * banner图片
     */
    private List<String> bannerImages;
    /**
     * 合作商家 图片
     */
    private List<String> merchantImages;
}
