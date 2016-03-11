package com.acc.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.acc.messenger.dao.DatabaseClass;
import com.acc.messenger.model.Message;
import com.acc.messenger.model.Profile;


public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	private Map<Long, Profile> profiles = DatabaseClass.getProfiles();

	public MessageService(){
		
		messages.put(1L, new Message(1L, "Hello World", "Gurusharan"));
		messages.put(2L, new Message(2L, "Pursuit of Happyness", "Rajat"));
		
		
		
	}





	public List<Message> getAllMessages() {

		return new ArrayList<Message>(messages.values());

	}

	public Message getMessage(long id) {

		return messages.get(id);

	}

	public Message addMessage(Message message) {

		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;

	}

	public Message updateMessage(Message message) {

		if (message.getId() <= 0) {

			return null;

		}

		messages.put(message.getId(), message);

		return message;
	}

	public Message removeMessage(long id) {

		return messages.remove(id);


	}
}
