package org.neos.webflow.service;

import org.neos.webflow.domain.Personal;
import org.neos.webflow.domain.User;
import org.neos.webflow.exceptions.IncorrectNewUserException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String performNewUser(User user) throws IncorrectNewUserException {
		
		if(user.getUser().equals("hugo")){
			System.out.println("El usuario ya existe");
			throw new IncorrectNewUserException();
		}
		else {
			System.out.println("El usuario no existe");
			return "success-admin";
		}
		
	}
	
	public Personal performNewPersonalData(Personal personal) throws IncorrectNewUserException {
		
		System.out.println("bussines para el objeto Personal.......");
		System.out.println("name: " + personal.getName() +" lastName:" + personal.getLastName()+ " email: " +personal.getEmail() );
		return personal;
		
	}

}
