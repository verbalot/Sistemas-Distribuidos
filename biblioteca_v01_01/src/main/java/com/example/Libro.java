package com.example;

public class Libro {
	private Long idLibro;
	private String titulo;
	private String autor;
	private String genero;

	public Libro() {
	}
	public Libro(String titulo, String autor, String genero) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setGenero(genero);
	}
/*
	public Libro(Long idLibro, String titulo, String autor, String genero) {
		this.idLibro = idLibro;
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setGenero(genero);
	}

	public Long getIdLibro() {
		return idLibro;
	}

	/*
	 * public void setIdLibro(Long idLibro) { this.idLibro = idLibro; }
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + " [" + autor + "] - Genero: " + genero;
	}
	public Long getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}
}
