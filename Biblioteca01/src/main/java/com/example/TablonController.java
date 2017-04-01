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
	private AccesoRepository repository;
	
	@PostConstruct
	public void init() {
		repository.save(new Acceso("Pepe", "1234567"));
		repository.save(new Acceso("Juan", "hola123"));
	}
	@RequestMapping("/")
	public String presentacion(Model model, Pageable page) {

		model.addAttribute("acceso", repository.findAll(page));

		return "presentacion";
	}
	
	

}

