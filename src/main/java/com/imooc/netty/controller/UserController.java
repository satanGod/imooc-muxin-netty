package com.imooc.netty.controller;

import com.imooc.netty.model.User;
import com.imooc.netty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/updateUser")
	public String updateUser() {
//		userService.updateUser();
		return "修改完成";
	}
	
}
