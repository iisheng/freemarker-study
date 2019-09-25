package com.example.service;

import com.example.entity.CaseDO;
import com.example.entity.CaseEnum;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:26:59
 */
public interface CaseService {

    void create(CaseDO caseDO);

    CaseDO getById(Long id);

    CaseDO update(CaseDO caseDO);

    List<CaseDO> queryByPage(int page);

    Integer getCount();

    List<CaseDO> queryByPageAndType(int page, int type);

    void delete(Long id);
}
