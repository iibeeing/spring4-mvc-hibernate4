package com.lei.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lei.demo.dao.*;
import com.lei.demo.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private UsersDAO usersDAO;

	@Transactional
	public int userCount() {
		return usersDAO.getAllUser().size();
	}

	public UsersDAO getUserDao() {
		return usersDAO;
	}

	public void setUserDao(UsersDAO userDao) {
		this.usersDAO = userDao;
	}

}
