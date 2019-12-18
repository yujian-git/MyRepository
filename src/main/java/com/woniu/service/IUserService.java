package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Users;

public interface IUserService {
	void save(Users user);
	List<Users> findAll();
}
