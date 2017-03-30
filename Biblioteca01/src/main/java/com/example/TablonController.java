package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {
	
	//Si se abre la URL http://127.0.0.1:8080/h2-console y se configura
	//la URL JDBC con el valor jdbc:h2:mem:testdb se puede acceder a la 
	//base de datos de la aplicación

	@Autowired
	private BibliotecaRepository repository;

	@PostConstruct
	public void init() {
		//repository.save(new Anuncio("Jesus", "Banegas", "jesusbanur@gmail.com","676155144"));
		repository.save(new Biblioteca());
	}

	@RequestMapping("/")
	public String tablon(Model model, Pageable page) {

		model.addAttribute("biblioteca", repository.findAll(page));

		return "presentacion";
	}

	@RequestMapping("/usuario/nuevo")
	public String nuevoAnuncio(Model model, Biblioteca biblioteca) {

		repository.save(biblioteca);

		return "usuario_guardado";

	}

	@RequestMapping("/anuncio/{id}")
	public String verAnuncio(Model model, @PathVariable long id) {
		
		Biblioteca biblioteca = repository.findOne(id);

		model.addAttribute("anuncio", biblioteca);

		return "ver_anuncio";
	}
}
