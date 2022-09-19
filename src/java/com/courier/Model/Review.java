package com.courier.Model; 

import com.andromeda.commons.model.BaseModel;

public class Review extends BaseModel
{
	private static final long serialVersionUID = 1L;
	public String name;
	public String email;
	public String subject;
	public String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	
}