package org.neos.webflow.domain;

import java.io.Serializable;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * para formar un validador en codigo, se deben seguir las siguientes reglas <br>
	 * 1 debe comenzar con la palabra validate
	 * 2 colocar el nombre de la accion a validar
	 * 3 este metodo se ejecutara en automatico antes de ejecutar la accion a seguir
	 * 4 debe estar habilitado los validator en el xml
	 * @param context
	 */
	public void validateShowFormUser(ValidationContext context) {
		System.out.println("EN EL METODO de Validacion.......");
		 MessageContext messages = context.getMessageContext();
		if(user==null||user.compareTo("")==0){
			 messages.addMessage(new MessageBuilder().error().source("user").
		                defaultText("Es obligatorio capturar el usuario").build());
			
		}
		if(password==null||password.compareTo("")==0){
			 messages.addMessage(new MessageBuilder().error().source("loginName").
		                defaultText("Es obligatorio capturar el password").build());
			
		}
		
	}

}
