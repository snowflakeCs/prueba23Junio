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
    private String name;
    private int voteCount;

    
    public MusicStyle() {
        //this.name = "";
    }
    
    public MusicStyle(String name) {
        this.name = name;this.voteCount = 0;
    }

    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
  public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }


    @Override
    public String toString() {
        return "MusicStyle{" + "id=" + id + ", name=" + name + '}';
    }
}

