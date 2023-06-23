package com.pruebatec.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserResponse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "music_style_id")
    private MusicStyle musicStyle;
  
    public UserResponse() {
       // this.name = "";
    }
    
    public UserResponse(String name, String email) {
        //this.name = name;
    }

    public long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "UserResponse{" + "id=" + id + '}';
    }
}
