package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface IUserService {
	String registerUser(User newUser);
	User validateUser(String email,String password);
	String updateAddress(int userId,String newAddress);
	List<User> getAllUsers();
	String deleteUserById(int userId);
}
