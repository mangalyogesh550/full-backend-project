package com.backend.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.project.entities.User;

//@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
