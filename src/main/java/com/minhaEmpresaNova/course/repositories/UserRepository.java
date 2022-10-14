package com.minhaEmpresaNova.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaEmpresaNova.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
