package com.studytrails.tutorials.springwebflow;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;

public class LoginCredentials implements Serializable {

	private static final long serialVersionUID = 6182390898687671093L;
	
	//@NotNull(message= "Es obligatorio capturar el usuario")
	@NotEmpty(message= "Es obligatorio capturar el usuario")
	@Size(min=4, max=10, message="El usuario debe tener minimo 4 caracteres y maximo 10")
	private String loginName;
	
	@NotEmpty(message= "{notEmpty.LoginCredentials.password.validation}")
	@Size(min=1, message="{size.LoginCredentials.password.validation}")
	private String password;

	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	public void validateDisplayLoginView(ValidationContext context) {
		System.out.println("EN EL METODO de Validacion.......");
		 MessageContext messages = context.getMessageContext();
		if(loginName==null||loginName.compareTo("")==0){
			 messages.addMessage(new MessageBuilder().error().source("loginName").
		                defaultText("Es obligatorio capturar el usuario").build());
			
		}
		if(password==null||password.compareTo("")==0){
			 messages.addMessage(new MessageBuilder().error().source("loginName").
		                defaultText("Es obligatorio capturar el password").build());
			
		}
		
	}*/
}
