package com.got.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.got.dao.NotesDao;
import com.got.model.Notes;
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

	public String addNote(Notes note) {

		return notesDao.addNote(note);

	}

	public NotesDao getNotesDao() {
		return notesDao;
	}

	public void setNotesDao(NotesDao notesDao) {
		this.notesDao = notesDao;
	}

}
