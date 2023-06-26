package com.pruebatec.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatec.application.dao.user_dao;
import com.pruebatec.application.entities.User;

import jakarta.transaction.Transactional;

@Service  
@Transactional  
public class User_service_impl implements User_service{
    
    @Autowired  
    private user_dao user_dao;  
      
    @Override  
    public boolean saveUser(User user) {  
        return user_dao.saveUser(user);  
    }  
  
    @Override  
    public List<User> getUsers() {  
        return user_dao.getUsers();  
    }  
  
    @Override  
    public boolean deleteUser(User user) {  
        return user_dao.deleteUser(user);  
    }  
  
    @Override  
    public List<User> getUserByID(User user) {  
        return user_dao.getUserByID(user);  
    }  
  
    @Override  
    public boolean updateUser(User user) {  
        return user_dao.updateUser(user);  
    }  
  
}
