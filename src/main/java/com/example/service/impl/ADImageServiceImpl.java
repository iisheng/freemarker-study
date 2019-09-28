package com.example.service.impl;

import com.example.entity.ADImage;
import com.example.mapper.ADImageMapper;
import com.example.service.ADImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/09/25 22:39:44
 */
@Service
public class ADImageServiceImpl implements ADImageService {

    @Autowired
    ADImageMapper adImageMapper;

    @Override
    public void create(ADImage adImage) {
        adImageMapper.insert(adImage);
    }

    @Override
    public List<ADImage> queryByPageAndType(int page, int type) {
        Map map = new HashMap<>(3);
        map.put("size", 10);
        map.put("cursor", page * 10);
        map.put("type", type);
        return adImageMapper.queryByPageAndType(map);
    }

    @Override
    public int getCountByType(int type) {
        Map map = new HashMap(1);
        map.put("type", type);
        return adImageMapper.getCountByType(map);
    }

    @Override
    public List<ADImage> queryAll() {
        return adImageMapper.queryAll();
    }
}
