package com.pruebatec.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "music_style")
public class MusicStyle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
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
    public void setId(Integer id) {
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
        return "MusicStyle{" + "id=" + id + ", name=" + name + ", voteCount=" + voteCount + '}';
    }
}

