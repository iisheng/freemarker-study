package com.example.mapper;

import com.example.entity.NewsDO;

import java.util.List;
import java.util.Map;

/**
 * @author iisheng
 * @date 2019/08/21 11:18:45
 */
public interface NewsMapper {
    /**
     * 插入
     *
     * @param newsDO
     */
    void insert(NewsDO newsDO);

    /**
     * 根据主键id获取用户信息
     *
     * @param id
     * @return
     */
    NewsDO selectById(long id);

    /**
     * 更新
     *
     * @param newsDO
     * @return
     */
    int update(NewsDO newsDO);

    /**
     * 查询列表
     *
     * @param map 包含 cursor 和 size
     * @return
     */
    List<NewsDO> queryByCursor(Map map);

    /**
     * 获取总记录数量
     *
     * @return
     */
    Integer getCount();
}
