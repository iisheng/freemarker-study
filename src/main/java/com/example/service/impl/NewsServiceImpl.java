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
    public List<NewsDO> queryByPageAndType(int page, int type) {
        Map map = new HashMap<>(3);
        map.put("cursor", page * 10);
        map.put("size", 10);
        if (type != 0) {
            map.put("type", type);
            return newsMapper.queryByPageAndType(map);
        }
        return newsMapper.queryByCursor(map);
    }

    @Override
    public List<NewsDO> queryByPage(int page) {
        Map map = new HashMap<>();
        map.put("cursor", page * 10);
        map.put("size", 10);
        return newsMapper.queryByCursor(map);
    }

    @Override
    public void delete(Long id) {
        newsMapper.delete(id);
    }
}
