package com.example.service;

import com.example.entity.CaseDO;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:26:59
 */
public interface CaseService {

    CaseDO getById(Long id);

    CaseDO update(Long id, CaseDO caseDO);

    List<CaseDO> queryByPage(int page);
}
