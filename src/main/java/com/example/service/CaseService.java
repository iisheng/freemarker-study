package com.example.service;

import com.example.entity.CaseDO;
import com.example.entity.CaseEnum;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:26:59
 */
public interface CaseService {

    CaseDO create(CaseDO caseDO);

    CaseDO getById(Long id);

    CaseDO update(Long id, CaseDO caseDO);

    List<CaseDO> queryByPage(int page);

    List<CaseDO> queryByPageAndType(int page, CaseEnum type);
}
