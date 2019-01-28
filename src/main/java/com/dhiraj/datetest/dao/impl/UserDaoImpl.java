package com.dhiraj.datetest.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhiraj.datetest.dao.UserDao;
import com.dhiraj.datetest.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session=sessionFactory.openSession();
		session.save(user);
		session.close();
	}

}
