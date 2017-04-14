package com.example;

public class Usuario extends Visitante {

	private String login;
	private String password;

	public Usuario() {
	}

	public Usuario(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Usuario(Visitante visitante, String login, String password) {
		Visitante usuario = new Visitante(visitante);
		usuario.setRol(Visitante.LOGADO);
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
}
