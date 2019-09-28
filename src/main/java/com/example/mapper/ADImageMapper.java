package com.example.mapper;

import com.example.entity.ADImage;

import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/08/21 11:18:45
 */
public interface ADImageMapper {

    /**
     * 插入
     *
     * @param adImage
     */
    void insert(ADImage adImage);

    /**
     * 查询列表
     *
     * @param map
     * @return
     */
    List<ADImage> queryByPageAndType(Map map);

    Integer getCountByType(Map type);

    List<ADImage> queryAll();

    void delete(Long id);
}
