package com.got.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.got.dao.NotesDao;
import com.got.exception.DataNotFoundException;
import com.got.model.Notes;
import com.got.model.User;
import com.got.service.NotesService;

@Service
@Transactional
public class NotesServiceImpl implements NotesService {

	public NotesDao notesDao;

	public NotesServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public NotesServiceImpl(NotesDao notesDao) {

		this.notesDao = notesDao;
	}
	@Override
	public String addNote(Notes note) {

		return notesDao.addNote(note);

	}
	
	@Override
	public List<Notes> getNotesForUser(User user) throws DataNotFoundException{
		return notesDao.getNotesForUser(user);
	}

	public NotesDao getNotesDao() {
		return notesDao;
	}

	public void setNotesDao(NotesDao notesDao) {
		this.notesDao = notesDao;
	}

	

}
