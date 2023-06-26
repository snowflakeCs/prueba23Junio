package com.pruebatec.application.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "votes")
public class VoteCount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "music_style_id")
    private Integer musicStyle;

    public VoteCount() {
    }

    public VoteCount(Integer musicStyle) {
        this.musicStyle = musicStyle;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(Integer musicStyle) {
        this.musicStyle = musicStyle;
    }


}

