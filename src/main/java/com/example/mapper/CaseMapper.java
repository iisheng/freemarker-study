package com.example.mapper;

import com.example.entity.CaseDO;

import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/08/21 11:18:45
 */
public interface CaseMapper {

    /**
     * 插入
     *
     * @param caseDO
     */
    void insert(CaseDO caseDO);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 根据主键id获取用户信息
     *
     * @param id
     * @return
     */
    CaseDO selectById(long id);
    /**
     * 根据主键id获取用户信息
     *
     * @param id
     * @return
     */
    CaseDO selectLeftById(long id);
    /**
     * 根据主键id获取用户信息
     *
     * @param id
     * @return
     */
    CaseDO selectRightById(long id);

    /**
     * 更新
     *
     * @param caseDO
     * @return
     */
    int update(CaseDO caseDO);

    /**
     * 查询列表
     *
     * @param map
     * @return
     */
    List<CaseDO> queryByCursor(Map map);


    /**
     * 查询列表
     *
     * @param map
     * @return
     */
    List<CaseDO> queryByPageAndType(Map map);

    /**
     * 获取总记录数量
     *
     * @return
     */
    Integer getCount();
}
