package com.pruebatec.application.controllers;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.pruebatec.application.entities.User;
import com.pruebatec.application.services.User_service;  

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class Controller {

 @Autowired  
    private User_service user_service;  
      
    @PostMapping("save-user")  
    public boolean saveUser(@RequestBody User user) {  
         return user_service.saveUser(user);  
          
    }  
      
    @GetMapping("users-list")  
    public List<User> allsUsers() {  
         return user_service.getUsers();  
          
    }  
      
    @DeleteMapping("delete-user/{id}")  
    public boolean deleteStudent(@PathVariable("id") int id,User user) {  
        user.setId(id);  
        return user_service.deleteUser(user);  
    }  
  
    @GetMapping("users/{id}")  
    public List<User> allstudentByID(@PathVariable("id") int id,User user) {  
         user.setId(id);  
         return user_service.getUserByID(user);  
          
    }  
      
    @PostMapping("update-user/{id}")  
    public boolean updateStudent(@RequestBody User user,@PathVariable("id") int id) {  
        user.setId(id);  
        return user_service.updateUser(user);  
    }  
    
}
