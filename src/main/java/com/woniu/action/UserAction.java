package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Users;
import com.woniu.service.IUserService;

@Controller
public class UserAction {
	private Users user;
	private List<Users> list;
	
	
	@Autowired
	IUserService ius;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public List<Users> getList() {
		return list;
	}

	public void setList(List<Users> list) {
		this.list = list;
	}

	public String save() {
		ius.save(user);
		return "success";
	}
	
	public String findAll() {
		list = ius.findAll();
		return "success";
	}
	
	
	
	
	
	
}
