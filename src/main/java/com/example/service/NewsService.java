package com.example.service;

import com.example.entity.NewsDO;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/11 11:43:23
 */
public interface NewsService {
    NewsDO getById(Long id);

    NewsDO update(Long id, NewsDO newsDO);

    List<NewsDO> queryByPage(int page);
}
