package com.imooc.netty.service.impl;

import com.github.pagehelper.PageHelper;
import com.imooc.netty.dao.UserDao;
import com.imooc.netty.model.User;
import com.imooc.netty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		PageHelper.startPage(1, 1);
		return userDao.getUsers();
	}

	/**
	 * 该方法测试事务控制，请根据你实际情况创建相应对象
	 */
	@Transactional
	@Override
	public void updateUser() {
		User user1 = new User();
		user1.setId(1);
		user1.setName("HowieLi");
		userDao.updateUser(user1);
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("HowieLi");
		userDao.updateUser(user2);
	}

}
