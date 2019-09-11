package com.example.service.impl;

import com.example.entity.CaseDO;
import com.example.mapper.CaseMapper;
import com.example.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:26:33
 */
@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseMapper caseMapper;

    @Override
    public CaseDO getById(Long id) {
        return caseMapper.selectById(id);
    }

    @Override
    public CaseDO update(Long id, CaseDO caseDO) {
        int update = caseMapper.update(id, caseDO);
        if (update > 0) {
            return getById(id);
        }
        throw new RuntimeException("更新失败");
    }

    @Override
    public List<CaseDO> queryByPage(int page) {
        return null;
    }
}
