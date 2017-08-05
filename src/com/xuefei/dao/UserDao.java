package com.xuefei.dao;

import com.xuefei.entity.User;

public interface UserDao {
	
	void save(User user);
	void update(User user);
	void delect(int id);
	User findById(int id);
	
}
