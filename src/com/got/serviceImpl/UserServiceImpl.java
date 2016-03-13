package com.got.serviceImpl;

import java.util.List;

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

	public User checkUser(String userEmailId, String passWord) {
		List<User> userList = userDao.checkUser(userEmailId);
		if(!userList.isEmpty() && userList.get(0).getPassWord().equals(passWord)){
			return userList.get(0);
		}else {

			return null;
		}

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
