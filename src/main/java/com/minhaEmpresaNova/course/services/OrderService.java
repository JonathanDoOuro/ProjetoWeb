package com.minhaEmpresaNova.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaEmpresaNova.course.entities.Order;
import com.minhaEmpresaNova.course.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll() {
		return OrderRepository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = OrderRepository.findById(Id);
		return obj.get(); //retorna o objeto do Tipo Order que estiver dentro de Obj
	}
}
