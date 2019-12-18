package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Users;

public interface IUserDao {
	void save(Users user);
	List<Users> findAll();
}
