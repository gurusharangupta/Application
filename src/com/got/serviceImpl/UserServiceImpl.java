package com.got.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.got.dao.UserDao;
import com.got.model.User;
import com.got.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceImpl(UserDao userDao) {

		this.userDao = userDao;

	}

	public boolean checkUser(String userEmailId, String passWord) {
		User user = userDao.checkUser(userEmailId);

		if (user.getPassWord().equals(passWord)) {
			return true;

		} else {

			return false;
		}

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
