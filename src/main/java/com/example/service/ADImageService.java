package com.example.service;

import com.example.entity.ADImage;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/25 22:38:11
 */
public interface ADImageService {

    void create(ADImage adImage);

    List<ADImage> queryByPageAndType(int page, int type);

    int getCountByType(int type);

    List<ADImage> queryAll();
}
