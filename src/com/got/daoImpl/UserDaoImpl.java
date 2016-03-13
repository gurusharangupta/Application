package com.got.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.got.dao.UserDao;
import com.got.model.User;

@Repository
public class UserDaoImpl implements UserDao {

private SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory= sessionFactory;
	}
	
	
	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<User> checkUser(String userEmailId) {
		// TODO Auto-generated method stub
		Query query =  getSessionFactory().getCurrentSession().createQuery("from User where userEmailId=?");
		query.setString(0, userEmailId);
		 List<User> list =  query.list();
		 
		return list;
		 
		
			 
		
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
