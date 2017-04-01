package com.example;

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
	private String password;
	
	public Acceso(){
		
	}
	public Acceso (String login, String password){
		super();
		this.login = login;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){ 
		return "Acceso [login=" + login + ", password=" + password + "]";
	}
}
