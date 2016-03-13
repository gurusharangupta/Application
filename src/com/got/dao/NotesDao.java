package com.got.dao;

import java.util.List;

import com.got.model.Notes;
import com.got.model.User;

public interface NotesDao {
	
	public String addNote(Notes note);

	public List<Notes> getNotesForUser(User user);

}
