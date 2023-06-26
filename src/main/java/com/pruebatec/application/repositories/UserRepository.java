package com.pruebatec.application.repositories;

import com.pruebatec.application.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/* 
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
User findByEmail(String email);
}*/
//CRUD
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
User findByEmail(String email);
}

