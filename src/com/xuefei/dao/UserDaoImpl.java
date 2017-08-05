package com.xuefei.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.xuefei.entity.User;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public void delect(int id) {
		getHibernateTemplate().bulkUpdate("delete from User where id=" + id);
	}

	@Override
	public User findById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
