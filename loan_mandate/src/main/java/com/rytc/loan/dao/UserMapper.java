package com.rytc.loan.dao;

import com.rytc.loan.model.User;
/**
 * 测试类
 * 
 *@author lzp
 * 2018年5月25日
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}