package com.got.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.got.dao.NotesDao;
import com.got.model.Notes;

@Repository
public class NotesDaoImpl implements NotesDao{

	
private SessionFactory sessionFactory;
	
	@Autowired
	public NotesDaoImpl(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}


	public NotesDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String addNote(Notes note){
		
		getSessionFactory().getCurrentSession().save(note);
		
		
		return "Save Successful";
		
		
		
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
