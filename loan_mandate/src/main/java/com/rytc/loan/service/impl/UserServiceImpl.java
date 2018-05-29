package com.rytc.loan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rytc.loan.dao.UserMapper;
import com.rytc.loan.model.User;
import com.rytc.loan.service.UserService;

/**
 * 测试类
 * 
 *@author lzp
 * 2018年5月25日
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public Integer insert(User user) {
		return userMapper.insert(user);
	}

}
