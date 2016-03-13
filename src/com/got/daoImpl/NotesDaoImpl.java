package com.got.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.got.dao.NotesDao;
import com.got.model.Notes;
import com.got.model.User;

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
	
	@Override
	public List<Notes> getNotesForUser(User user) {
		
		@SuppressWarnings("unchecked")
		Query query =  getSessionFactory().getCurrentSession().createQuery("from Notes where notesUser = ?");
		query.setEntity(0, user);
		List<Notes> notesList = (List<Notes>)query.list();
	
	return notesList;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	
}
