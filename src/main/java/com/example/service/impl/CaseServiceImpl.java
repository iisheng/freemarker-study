package com.example.service.impl;

import com.example.entity.CaseDO;
import com.example.mapper.CaseMapper;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/08/21 11:26:33
 */
@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseMapper caseMapper;

    @Override
    public void create(CaseDO caseDO) {
        caseMapper.insert(caseDO);
    }

    @Override
    public CaseDO getById(Long id) {
        return caseMapper.selectById(id);
    }

    @Override
    public CaseDO update(CaseDO caseDO) {
        if (caseDO.getId() == 0) {
            throw new RuntimeException("id不能为空");
        }
        int update = caseMapper.update(caseDO);
        if (update > 0) {
            return getById(caseDO.getId());
        }
        throw new RuntimeException("更新失败");
    }

    @Override
    public List<CaseDO> queryByPage(int page) {
        Map map = new HashMap<>(2);
        map.put("cursor", page * 10);
        map.put("size", 10);
        return caseMapper.queryByCursor(map);
    }

    @Override
    public Integer getCount() {
        return caseMapper.getCount();
    }

    @Override
    public List<CaseDO> queryByPageAndType(int page, int type) {
        Map map = new HashMap<>(3);
        map.put("cursor", page * 10);
        map.put("size", 10);
        if (type != 0) {
            map.put("type", type);
            return caseMapper.queryByPageAndType(map);
        }
        return caseMapper.queryByCursor(map);
    }

    @Override
    public void delete(Long id) {
        caseMapper.delete(id);
    }
}
