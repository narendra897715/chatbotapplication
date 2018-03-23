package com.merilytics.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserIdPasswordDTO {
	private String emailId;
	private String password;

	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
