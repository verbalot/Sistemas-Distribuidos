package com.example;
import com.example.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@ComponentScan
@Component
public class UserRepositoryAuthenticationProvider implements AuthenticationProvider  {
	 
	@Autowired
		private AccesoRepository accesoRepository;
	
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		Acceso acceso = accesoRepository.findByLogin(auth.getName());
		
		//Comprobamos si el usuario existe
		if (acceso == null){
			throw new BadCredentialsException("Usuario no encontrado");
		}
		
		// Comprobamos si el password es correcto
		String password = (String) auth.getCredentials();
	    //Comparo las dos contraseñas, la almacenada y la escrita
		if (!new BCryptPasswordEncoder().matches(password, acceso.getPassword())) {
		throw new BadCredentialsException("Usuario o password incorrecto");
		}
		
		return new UsernamePasswordAuthenticationToken(acceso.getLogin(), password);
		
	}
	
	@Override
	public boolean supports(Class<?> authenticationObject) {
		return true;
	}

}



