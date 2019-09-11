package com.example.service.impl;

import com.example.entity.NewsDO;
import com.example.mapper.NewsMapper;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/09/11 11:44:32
 */
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public NewsDO getById(Long id) {
        return newsMapper.selectById(id);
    }

    @Override
    public NewsDO update(Long id, NewsDO newsDO) {
        int update = newsMapper.update(id, newsDO);
        if (update > 0) {
            return getById(id);
        }
        throw new RuntimeException("更新失败");
    }

    @Override
    public List<NewsDO> queryByPage(int page) {
        return newsMapper.queryByPage(page);
    }
}
