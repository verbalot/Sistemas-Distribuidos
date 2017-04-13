package com.example;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String login;
	private String passwordHash;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;
	
	public Acceso(){
		
	}
	public Acceso (String login, String password){
		super();
		this.login = login;
		this.passwordHash = password;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return passwordHash;
	}
	
	public void setPassword(String password) {
		this.passwordHash = password;
	}
	
	@Override
	public String toString(){ 
		return "Acceso [login=" + login + ", password=" + passwordHash + "]";
	}
}
