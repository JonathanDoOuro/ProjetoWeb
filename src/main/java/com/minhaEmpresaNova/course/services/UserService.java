package com.minhaEmpresaNova.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minhaEmpresaNova.course.entities.User;
import com.minhaEmpresaNova.course.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long Id) {
		Optional<User> obj = userRepository.findById(Id);
		return obj.get(); //retorna o objeto do Tipo User que estiver dentro de Obj
	}
}
