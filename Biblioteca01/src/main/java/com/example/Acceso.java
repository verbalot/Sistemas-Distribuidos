package com.example;
import com.example.*;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Entity
@Component
@SessionScope
public class Acceso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String login;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;
	
	
	
	public Acceso(){
		
	}
	public Acceso (String login, String password, String roles){
		super();
		this.login = login;
		this.password = password;
		this.roles = new ArrayList<>(Arrays.asList(roles));

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
	
	public List<String> getRoles() {
		return roles;
	}
	
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString(){ 
		return "Acceso [login=" + login + ", password=" + password + "]";
	}
}