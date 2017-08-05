package com.xuefei.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xuefei.dao.UserDao;
import com.xuefei.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDaoImpl;
	
	@Transactional
	@Override
	public void save(User user) {
		userDaoImpl.save(user);
	}
	
	@Transactional
	@Override
	public void update(User user) {
		userDaoImpl.update(user);
	}

	@Transactional
	@Override
	public void delect(int id) {
		userDaoImpl.delect(id);
	}

	@Transactional
	@Override
	public User findById(int id) {
		return userDaoImpl.findById(id);
	}

}
