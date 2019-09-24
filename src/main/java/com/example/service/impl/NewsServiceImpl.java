package com.example.service.impl;

import com.example.entity.NewsDO;
import com.example.mapper.NewsMapper;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/09/11 11:44:32
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public NewsDO getById(Long id) {
        return newsMapper.selectById(id);
    }

    @Override
    public NewsDO update(NewsDO newsDO) {
        int update = newsMapper.update(newsDO);
        if (update > 0) {
            return getById(newsDO.getId());
        }
        throw new RuntimeException("更新失败");
    }

    @Override
    public void create(NewsDO newsDO) {
        newsMapper.insert(newsDO);
    }

    @Override
    public Integer getCount() {
        return newsMapper.getCount();
    }

    @Override
    public List<NewsDO> queryByPage(int page) {
        Map map = new HashMap<>();
        map.put("cursor", page * 10);
        map.put("size", 10);
        return newsMapper.queryByCursor(map);
    }
}
