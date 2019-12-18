package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.Users;
import com.woniu.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao iud;
	
	@Override
	public void save(Users user) {
		// TODO Auto-generated method stub
		iud.save(user);
		System.out.println(1/0);
		user.setUserName("ÕÅÈý");
	}
	
	@Override
	public List<Users> findAll() {
		List<Users> users = iud.findAll();
		return users;
	}

}
