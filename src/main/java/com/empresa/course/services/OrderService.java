package com.empresa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.course.entities.Order;
import com.empresa.course.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = orderRepository.findById(Id);
		return obj.get(); //retorna o objeto do Tipo Order que estiver dentro de Obj
	}
}
