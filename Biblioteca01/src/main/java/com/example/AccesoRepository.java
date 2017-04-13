package com.example;

import com.example.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccesoRepository extends JpaRepository<Acceso, Long> {
	
	Acceso findByLogin(String login);
	
	Acceso findByPassword(String password);

}
