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
	
	@Autowired
	private AltaLibroRepository altalibrorepository;
	
	
	@PostConstruct
	public void init() {
		Acceso a1 = new Acceso ("Pepe","1234567","ROLE_USER");
		Acceso a2 = new Acceso ("Juan","8957@","ROLE_USER");
		Acceso a3 = new Acceso ("Alberto","sol78","ROLE_USER");
		Acceso a4 = new Acceso ("Carlos","ventana10","ROLE_USER");
		Acceso admin = new Acceso ("jesus","1234","ROLE_ADMIN");
		
		AltaLibro alt1 = new AltaLibro("Algebra Lineal","E.Santos","Matematicas");
		AltaLibro alt2 = new AltaLibro("Fisica Cuantica","Garcia","Ciencia");
		AltaLibro alt3 = new AltaLibro("El señor de las moscas","William Golding","Literatura");
		AltaLibro alt4 = new AltaLibro("Viaje al centro de la tierra","Julio Verne","Ciencia Ficcion");
		AltaLibro alt5 = new AltaLibro("Don Quijote de la Mancha","Miguel de Cervantes","Aventuras");
		AltaLibro alt6 = new AltaLibro("El viejo y el mar","Ernest Hemingway","Aventuras");
		
		repository.save(a1);
		repository.save(a2);
		repository.save(a3);
		repository.save(a4);
		repository.save(admin);
		
		altalibrorepository.save(alt1);
		altalibrorepository.save(alt2);
		altalibrorepository.save(alt3);
		altalibrorepository.save(alt4);
		altalibrorepository.save(alt5);
		altalibrorepository.save(alt6);
		
	}
	
	@RequestMapping("/")
	public String presentacion(Model model, Pageable page) {

		model.addAttribute("acceso", repository.findAll(page));

		return "presentacion";
	}
		
	
	@RequestMapping("/usuario/nuevo")
	public String nuevoUsuario(Model model, Acceso usuario) {

		repository.save(usuario);

		return "usuario_guardado";

	}
	
	@RequestMapping("/libro/nuevo")
	public String nuevoLibro(Model model, AltaLibro libro) {

		altalibrorepository.save(libro);

		return "libro_guardado";

	}
	
	@RequestMapping("/catalogo")
	public String ListaLibros(Model model) {
		
		model.addAttribute("libros", altalibrorepository.findAll());
		return "catalogos";

	}
	

}
