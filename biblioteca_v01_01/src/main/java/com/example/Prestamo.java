package com.example;

import java.util.Calendar;
import java.util.Date;

public class Prestamo {
	private Long idPrestamo;
	private Long idLibro;
	private Long idUsuario;
	private Date fechaInicio;
	private Date fechaCierre;
	private String comentario;
	private boolean libre;

	public Prestamo() {

	}

	public Prestamo(Long idPrestamo, Long idLibro, Long idUsuario, Date fechaInicio) {
		this.setIdPrestamo(idPrestamo);
		this.setIdLibro(idLibro);
		this.setIdUsuario(idUsuario);
		this.setFechaInicio(fechaInicio);
		this.setFechaCierre(null);
		this.setComentario("");
	}

	public Long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaInicio);
		calendar.add(Calendar.DAY_OF_YEAR, 15);
		this.fechaCierre = calendar.getTime();
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Prestamo: " + idPrestamo + ". Relativo al libro: " + idLibro + ", del usuario" + idUsuario
				+ ". Inicio del Prestamo: " + fechaInicio + " y finaliza/do: " + fechaCierre;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
}
