package com.got.dao;

import java.util.List;

import com.got.model.User;

public interface UserDao {
	
	public List<User> checkUser(String userEmailId); 

}
