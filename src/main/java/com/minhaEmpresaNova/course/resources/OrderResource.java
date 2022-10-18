package com.minhaEmpresaNova.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaEmpresaNova.course.entities.Order;
import com.minhaEmpresaNova.course.services.OrderService;

@RestController
@RequestMapping(value = "/Orders")
public class OrderResource {
	
	@Autowired //dependencia autoInjetada pelo Spring
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> lista = OrderService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}") //passando o id como parametro pela url
	public ResponseEntity<Order> findById(@PathVariable Long id) { //utiliza o id da url
		Order obj = OrderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
