package com.xuefei.service;

import com.xuefei.entity.User;

public interface UserService {
	void save(User user);
	void update(User user);
	void delect(int id);
	User findById(int id);
}
