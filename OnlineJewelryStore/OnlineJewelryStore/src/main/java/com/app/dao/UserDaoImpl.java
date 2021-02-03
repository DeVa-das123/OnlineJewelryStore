package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository

public class UserDaoImpl implements IUserDao {
	@PersistenceContext
	private EntityManager mgr;

	@Override
	public String registerUser(User newUser) {
		String msg = "registered sucessfully";
		mgr.persist(newUser);
		return msg;

	}

	@Override
	public User validateUser(String email, String password) {

		String jpql = "select u from User u where u.email =:em and u.password=:pa";

		return mgr.createQuery(jpql, User.class).setParameter("em", email).setParameter("pa", password)
				.getSingleResult();

//		return false;
	}

	@Override
	public List<User> getAllUsers() {

		String jpql = "select u from User u";
		return mgr.createQuery(jpql, User.class).getResultList();

	}

	@Override
	public String updateAddress(int userId, String newAddress) {
		String msg = "user updated";
		System.out.println("in " + getClass().getName() + userId);
		User u = mgr.find(User.class, userId);
		u.setAddress(newAddress);
		User u1 = mgr.merge(u);
		System.out.println("updated address user :" + u1);
		return msg;
	}

	@Override
	public String deleteUserById(int userId) {
		String mesg = "User deletion failed";
		User user = mgr.find(User.class, userId);
		if (user != null) {
			mgr.remove(user);
			mesg = "User deleted successfully";
		}
		return mesg;
	}

}
