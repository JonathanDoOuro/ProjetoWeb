package com.minhaEmpresaNova.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaEmpresaNova.course.entities.Product;
import com.minhaEmpresaNova.course.services.ProductService;

@RestController
@RequestMapping(value = "/Products")
public class ProductResource {
	
	@Autowired //dependencia autoInjetada pelo Spring
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> lista = productService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}") //passando o id como parametro pela url
	public ResponseEntity<Product> findById(@PathVariable Long id) { //utiliza o id da url
		Product obj = productService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
