package com.devsuperior.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
