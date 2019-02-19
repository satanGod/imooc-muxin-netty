package com.imooc.netty.service;


import com.imooc.netty.model.User;

import java.util.List;

public interface IUserService {
	 List<User> getUsers();
	 void updateUser();
}
