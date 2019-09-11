package com.example.mapper;

import com.example.entity.CaseDO;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:18:45
 */
public interface CaseMapper {

    /**
     * 根据主键id获取用户信息
     *
     * @param id
     * @return
     */
    CaseDO selectById(long id);

    /**
     * 更新
     *
     * @param id
     * @param caseDO
     * @return
     */
    int update(Long id, CaseDO caseDO);

    /**
     * 查询列表
     *
     * @param page
     * @return
     */
    List<CaseDO> queryByPage(int page);
}
