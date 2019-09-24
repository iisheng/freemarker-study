package com.example.service;

import com.example.entity.NewsDO;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/11 11:43:23
 */
public interface NewsService {
    NewsDO getById(Long id);

    NewsDO update(NewsDO newsDO);

    void create(NewsDO newsDO);

    Integer getCount();

    List<NewsDO> queryByPage(int page);
}
