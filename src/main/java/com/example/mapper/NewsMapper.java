package com.example.mapper;

import com.example.entity.NewsDO;

import java.util.List;

/**
 * @author iisheng
 * @date 2019/08/21 11:18:45
 */
public interface NewsMapper {

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
     * @param id
     * @param newsDO
     * @return
     */
    int update(Long id, NewsDO newsDO);

    /**
     * 查询列表
     *
     * @param page
     * @return
     */
    List<NewsDO> queryByPage(int page);
}
