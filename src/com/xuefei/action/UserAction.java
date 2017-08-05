package com.xuefei.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.xuefei.entity.User;
import com.xuefei.service.UserService;
import com.xuefei.utils.BaseAction;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction {

	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	private static final long serialVersionUID = 1L;
	@Resource
	private UserService userServiceImpl;
	
	public String save() {
		User user=new User();
		user.setName("张三");
		userServiceImpl.save(user);
		return "save";
	}
	
	public String update() {
		User user=new User();
		user.setId(1);
		user.setName("李四");
		userServiceImpl.update(user);
		return "update";
	}
	
	public String delect() {
		userServiceImpl.delect(2);
		return "delect";
	}
	
	public String findById() {
		userServiceImpl.findById(1);
		return "findById";
	}
}
