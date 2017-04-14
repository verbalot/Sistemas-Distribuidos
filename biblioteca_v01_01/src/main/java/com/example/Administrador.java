package com.example;

public class Administrador extends Usuario {
	public Administrador() {

	}

	public Administrador(String login, String password) {

	}

	public Administrador(Usuario usuario, String login, String password) {
		Usuario administrador = new Usuario(usuario, login, password);
		administrador.setRol(Visitante.ADMIN);
	}
}
