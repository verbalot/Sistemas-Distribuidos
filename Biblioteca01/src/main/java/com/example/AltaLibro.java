package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AltaLibro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String titulo;
	private String autor;
	private String materia;
	
public AltaLibro(){
		
	}
public AltaLibro (String titulo, String autor, String materia){
	super();
	this.titulo = titulo;
	this.autor = autor;
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

public String getMateria() {
	return materia;
}

public void setMateria(String materia) {
	this.materia = materia;
}

@Override
public String toString(){ 
	return "AltaLibro [titulo=" + titulo + ", autor=" + autor + ", materia=" + materia+ "]";
}

}
