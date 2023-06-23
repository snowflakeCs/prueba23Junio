package com.pruebatec.application.repositories;
import com.pruebatec.application.entities.UserResponse;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface UserResponseRepository extends CrudRepository<UserResponse, Long> {
    List<UserResponse> findByUserId(Long userId);
}
