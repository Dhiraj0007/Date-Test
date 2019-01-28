package com.dhiraj.datetest.service.impl;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.datetest.Response;
import com.dhiraj.datetest.Status;
import com.dhiraj.datetest.dao.UserDao;
import com.dhiraj.datetest.model.User;
import com.dhiraj.datetest.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public Response signup(User user) {
		try {
			userDao.save(user);
			return new Response(Status.SUCCESS);
		}catch(ConstraintViolationException e) {
			return new Response(Status.EMAIL_ALREADY_EXIST);
		}catch (Exception e) {
			e.printStackTrace();
			return new Response(Status.SERVER_ERROR);
		}
	}

}
