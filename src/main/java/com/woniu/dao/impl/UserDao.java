package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.Users;


@Repository
public class UserDao implements IUserDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public void save(Users user) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(user);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createCriteria(Users.class).list();
	}

}
