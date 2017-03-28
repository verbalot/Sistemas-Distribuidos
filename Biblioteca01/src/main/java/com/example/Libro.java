package com.example;

public class Libro {

	private String titulo;
	private String autor;
	private String materia;
	private String observaciones;
	
	public Libro(){
		
	}
	
	public Libro(String titulo, String autor,String materia){
		this.titulo=titulo;
		this.autor=autor;
		this.materia = materia;
	}
	
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
	public String getMateria(){
		return materia;

	}
	public void setMateria(String materia){
		this.materia = materia;
	}
	
	public void getObservaciones(String observaciones){
		this.observaciones= observaciones;
	}
	
	public String setObservaciones(){
		return observaciones;
	}
	
	
	@Override
	public String toString(){
		return "Titulo: " + this.titulo + " . Autor: " + this.autor + " .Perteneciente a la Materia: " + this.materia 
				+ " [" + this.observaciones + "]."  ;
	}
	
}
