package com.pruebatec.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MusicStyle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    
    public MusicStyle() {
        this.name = "";
    }
    
    public MusicStyle(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "MusicStyle{" + "id=" + id + ", name=" + name + '}';
    }
}
