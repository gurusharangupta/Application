package com.got.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.got.model.Notes;




@Path("/notes")
public class NotesResource {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Notes> getMessages(){
		
		
	}
}
