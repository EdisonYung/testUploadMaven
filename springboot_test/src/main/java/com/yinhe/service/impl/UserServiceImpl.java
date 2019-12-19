package com.yinhe.service.impl;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.yinhe.bean.User;
import com.yinhe.mapper.UserMapper;
import com.yinhe.service.UserService;


@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;
	
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<User> userlist() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}

	



}
