package com.empresa.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.course.entities.User;
import com.empresa.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired //dependencia autoInjetada pelo Spring
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> lista = userService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}") //passando o id como parametro pela url
	public ResponseEntity<User> findById(@PathVariable Long id) { //utiliza o id da url
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}