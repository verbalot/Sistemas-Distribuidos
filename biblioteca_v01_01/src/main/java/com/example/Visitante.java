package com.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Visitante {

	public static final int ADMIN = 0;
	public static final int LOGADO = 1;
	public static final int OCASIONAL = 2;

	private int idVisitante;
	protected Date fecha_Conexion;
	private int rol;

	public Visitante() {

	}

	// Datos del perfil inicial, en este caso hasta que NO se registren todos
	// serán tratados como usuarios ajenos a la aplicacion.
	public Visitante(int idVisitante) {
		Calendar calendar = new GregorianCalendar();
		this.setIdVisitante(idVisitante);
		this.fecha_Conexion = calendar.getTime();
		this.setRol(OCASIONAL);
	}
	
	public Visitante(Visitante visitante) {
		this.setIdVisitante(visitante.idVisitante);
		this.fecha_Conexion = visitante.fecha_Conexion;
		this.setRol(visitante.getRol());
	}
	public int getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(int idUsuario) {
		this.idVisitante = idUsuario;
	}

	public int getRol() {
		return rol;
	}

	public String getRolToString() {
		String cadena = "";
		switch (this.rol) {
		case ADMIN:
			cadena = "ADMIN";
			break;
		case LOGADO:
			cadena = "LOGADO";
			break;
		default:
			cadena = "OCASIONAL";
		}

		return cadena;

	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Inicio de Sesión: " + fecha_Conexion + ". Rol[" + this.getRolToString() + "] Id de Usuario:"
				+ idVisitante;
	}
}
