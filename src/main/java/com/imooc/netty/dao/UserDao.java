package com.imooc.netty.dao;

import com.imooc.netty.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
	public List<User> getUsers();//
	public void updateUser(User user);
}
