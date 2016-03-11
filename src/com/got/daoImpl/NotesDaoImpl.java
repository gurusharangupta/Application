package com.got.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.got.dao.NotesDao;
import com.got.model.User;


public class NotesDaoImpl implements NotesDao{

	
private SessionFactory sessionFactory;
	
	@Autowired
	public NotesDaoImpl(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}


	public boolean checkUser(String userName,String passWord) {
		// TODO Auto-generated method stub
		List<User> userList =  getSessionFactory().getCurrentSession().createQuery("from User where userName=?")
        .setParameter(0, userName).list();
		 User user = userList.get(0);
		 if(user.getPassWord().equals(passWord)){
			 
			 return true;
		 }else{
			 
			 return false;
			 
		 }
			 
		
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
