package com.minhaEmpresaNova.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaEmpresaNova.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
