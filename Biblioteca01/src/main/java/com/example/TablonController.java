package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TablonController {
	private List<Libro> catalogo = new ArrayList<>();
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public TablonController() {
		
		
		catalogo.add(new Libro("Capitan Alatriste", "Perez Reverte, Arturo","Novela Historica"));
		catalogo.add(new Libro("Episodios Nacionales", "Perez Galdos, Benito","Novela Historica"));
		catalogo.add(new Libro("Calculus","Escritor","Ciencia Aplicada"));
		
		usuarios.add(new Usuario("admin","admin"));
		usuarios.add(new Usuario("pedro","guerra"));
		usuarios.add(new Usuario("maria","fernandez"));
	}

	

	
	@GetMapping("/presentacion")
	public String presentacion(Model model) {

		model.addAttribute("catalogo", catalogo);

		return "presentacion";
	}

	
	@GetMapping("/catalogo")
	public String catalogo(Model model) {

		model.addAttribute("catalogo", catalogo);

		return "catalogo";
	}
	
	
	@PostMapping("/libro/nuevo")
	public String nuevoLibro(Model model, Libro libro) {

		catalogo.add(libro);

		return "libro_guardado";

	}
	

	@GetMapping("/ver_libro/{num}")
	public String libro(Model model, @PathVariable int num) {

		Libro libro = catalogo.get(num - 1);

		model.addAttribute("libro", libro);

		return "ver_libro";
	}
	
	@PostMapping("/usuario/nuevo")
	public String nuevoUsuario(Model model, Usuario usuario) {

		usuarios.add(usuario);

		return "usuario_guardado";

	}

}