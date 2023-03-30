package com.heal.service.impl;

import com.heal.domain.User;
import com.heal.mapper.UserMapper;
import com.heal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p> TODO </p>
 *
 * @author by jiaxu
 * @Classname UserServiceImpl
 * @Date 2023/3/30 19:36
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserById(int id) {
		return userMapper.findUserById(id);
	}
}