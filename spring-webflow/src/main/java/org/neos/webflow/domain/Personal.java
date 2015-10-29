package org.neos.webflow.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Personal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message= "{notEmpty.Personal.name.validation}")
	private String name;
	
	@NotEmpty(message= "{notEmpty.Personal.lastName.validation}")
	private String lastName;
	
	@NotEmpty(message= "{notEmpty.Personal.email.validation}")
	@Email(message="{email.Personal.email.validation}")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
