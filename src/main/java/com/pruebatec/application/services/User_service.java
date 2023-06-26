package com.pruebatec.application.services;

import java.util.List;

import com.pruebatec.application.entities.User;

public interface User_service {
    public boolean saveUser(User user);  
    public List<User> getUsers();  
    public boolean deleteUser(User user);  
    public List<User> getUserByID(User user);  
    public boolean updateUser(User user);  
}
