package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDao dao;
	@Override
	public String registerUser(User newUser) {
	
		return dao.registerUser(newUser);
	}

	@Override
	public User validateUser(String email, String password) {
	
		return dao.validateUser(email, password);
	}

	@Override
	public String updateAddress(int userId,String newAddress) {
		
		return dao.updateAddress(userId, newAddress);
	}

	@Override
	public List<User> getAllUsers() {
		
		return dao.getAllUsers();
	}

	@Override
	public String deleteUserById(int userId) 
	{
		
		return dao.deleteUserById(userId);
	}
	
	
	

}
