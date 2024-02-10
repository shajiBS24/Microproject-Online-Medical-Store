package com.mhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mhc.bean.Response;
import com.mhc.bean.User;
import com.mhc.service.UserService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/register")
	public String performRegister(@RequestBody User user) {
		return service.createUser(user);
	}

	@GetMapping("/viewUser")
	public List<User> getAllUsers() {
		System.out.println("Inside View All");
		Iterator<User> it = service.getAllUsers().iterator();
		List<User> list = new ArrayList<User>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	@PostMapping("/login")
	public ResponseEntity<Response> performLogin(@RequestBody User user) {
		Response res = service.login(user);
		return ResponseEntity.ok(res);
	}

//	@PutMapping("/{id}")
//	public User updatUser(@PathVariable int id, @RequestBody User user) {
//		user.setId(id);
//		return service.updateUser(user);
//	}
//
//	
//	@DeleteMapping("/{id}")
//	public void deleteUser(@PathVariable int id) {
//		service.deleteUser(id);
//	}

}