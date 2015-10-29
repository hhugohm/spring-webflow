package com.studytrails.tutorials.springwebflow;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public String performLogin(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException {

		if (loginCredentials.getLoginName() != null && loginCredentials.getLoginName().trim().equalsIgnoreCase("hugo")
				&& loginCredentials.getPassword() != null
				&& loginCredentials.getPassword().trim().equalsIgnoreCase("1234")) {
			// user successfully logged in
			return "success";
		} else {
			throw new IncorrectLoginCredentialsException();
		}
	}
}
