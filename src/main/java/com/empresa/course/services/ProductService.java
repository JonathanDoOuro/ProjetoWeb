package com.empresa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.course.entities.Product;
import com.empresa.course.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = productRepository.findById(Id);
		return obj.get(); //retorna o objeto do Tipo Product que estiver dentro de Obj
	}
}
