package com.mhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhc.Repository.UserRepo;
import com.mhc.bean.Response;
import com.mhc.bean.User;

import java.util.List;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	

	
	public User findByUsername(String username) {
		return repo.findByUsername(username);
	}
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public String createUser(User user) {
		repo.save(user);
		return "User Registered";
	}
	
	public User updateUser(User user) {
		return repo.save(user);
	}

//	public User updateUser(Long userId, User user) {
//		
//		User user1 = repo.getById(userId);
//		
//		if(user1 != null) {
//			user1.setUserName(user.getUserName());
//			user1.setEmail(user.getEmail());
//			user1.setPhone(user.getPhone());
//			user1.setPassword(user.getPassword());
//			user1.setUserType(user.getUserType());
//		}
//		return repo.save(user1);
//	}

	public void deleteUser(int id) {
		repo.deleteById(id);
	}

//	public boolean login(User user) {
//		User ref = repo.findByEmail(user.getEmail());
//		User pass = repo.findByPassword(user.getPassword());
//		if (ref != null && pass != null) {
//			String value = ref.getPassword();
//			String word = pass.getPassword();
//			return value.equals(word);
//		} else {
//			return false;
//		}
//	}
//
//	public String getUserType(String email) {
//		User user = repo.findByEmail(email);
//		if (user != null) {
//			return user.getUserType();
//		}
//		return null;
//	}
	public Response login(User user) {
		User ref = repo.findByUsername(user.getUsername());
		User pass = repo.findByPassword(user.getPassword());
		if (ref != null && pass != null) {
			String value = ref.getPassword();
			String word = pass.getPassword();
			if (value.equals(word)) {
				String res = ref.getUsertype();
				if (res.equals("admin")) {
					return new Response("Admin Success");
				} else {
					return new Response("User Success");
				}
			} else {
				return new Response("Login Fail");
			}
		} else {
			return new Response("Login Fail");
		}

	}

}
