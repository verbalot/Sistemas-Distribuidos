package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {

	private List<Libro> libros = new ArrayList<>();

	public TablonController() {
		libros.add(new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", "Realismo Fantastico"));
		libros.add(new Libro("Los santos inocentes", "Miguel Delibes Setien", "Novela Costumbrista"));
		libros.add(new Libro("Memorias de Adriano", "Marguerite Yourcenar", "Novela Historica"));

	}

	@RequestMapping("/")
	public String tablon(Model model) {

		model.addAttribute("libros", libros);

		return "tablon";
	}

	@RequestMapping("/tablonInterno")
	public String tablonInterno(Model model) {

		model.addAttribute("libros", libros);

		return "tablonInterno";

	}

	@RequestMapping("/tablonAdministrador")
	public String tablonAdministrador(Model model) {

		model.addAttribute("libros", libros);

		return "tablonAdministrador";
	}

	/*
	 * @RequestMapping("/libro/{num}") 
	 * public String modificarLibro(Model model, @PathVariable int num) {
	 * 
	 * Libro libro = libros.get(num - 1);
	 * 
	 * model.addAttribute("libro", libro);
	 * 
	 * return "modificarLibro";
	 * 
	 * }
	 */
	@RequestMapping("/libro/nuevo")
	public String nuevoLibro(Model model, Libro libro) {
		String cadena = "libro_guardado";
		if (libro.getTitulo().equals("")) {
			cadena = "operacion_cancelada";
		} else {
			libros.add(libro);
		}
			
		return cadena;

	}

	@RequestMapping("/libro/{num}")
	public String verLibro(Model model, @PathVariable int num) {

		Libro libro = libros.get(num - 1);

		model.addAttribute("libro", libro);

		return "ver_libro";
	}
}