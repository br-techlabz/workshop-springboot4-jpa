package br.techlabz.curso_springboot_nelioalves.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.techlabz.curso_springboot_nelioalves.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User>findAll(){
		User u = new User(1L,"Willian","will@email.com","999-99999","senha123");
		
		return ResponseEntity.ok().body(u);
	}
	
}
