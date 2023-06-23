package com.pruebatec.application.repositories;

import com.pruebatec.application.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
/* 
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
User findByEmail(String email);
}*/
//CRUD
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

