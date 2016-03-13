package com.got.resource;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.got.model.Notes;
import com.got.model.User;
import com.got.service.NotesService;
import com.got.service.UserService;




@Path("/notes")
@Component
public class NotesResource {
	
	@Autowired
	private UserService userService;
	@Autowired
	private NotesService notesService;
	

	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Notes> getNotesForUser(@HeaderParam("emailid") String emailId,@HeaderParam("password")String password){
		List<Notes> notes = null;
		User userObj = userService.checkUser(emailId, password);
		if(userObj != null){
			
			notes = notesService.getNotesForUser(userObj);
		}
		
		
		
		return notes;
		
		
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addNotes(Notes note){
		
		User user = userService.checkUser(note.getNotesUser().getUserEmailId(), note.getNotesUser().getPassWord());
		if(user != null){
			Date date = new Date();
			note.setNotesUser(user);
			note.setCreateTime(date);
			note.setUpdateTime(date);
			return notesService.addNote(note);
		}
		
		return "Save Unsuccessful";
		
		
	}
	
	

	public NotesService getNotesService() {
		return notesService;
	}



	public void setNotesService(NotesService notesService) {
		this.notesService = notesService;
	}



	public UserService getUserService() {
		return userService;
	}



	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
