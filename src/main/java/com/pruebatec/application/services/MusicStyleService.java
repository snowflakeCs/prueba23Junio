package com.pruebatec.application.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatec.application.entities.MusicStyle;
import com.pruebatec.application.repositories.MusicStyleRepository;

import java.util.List;

@Service
public class MusicStyleService {

    private final MusicStyleRepository musicStyleRepository;

    @Autowired
    public MusicStyleService(MusicStyleRepository musicStyleRepository) {
        this.musicStyleRepository = musicStyleRepository;
    }

    public List<MusicStyle> getAllMusicStyles() {
        return (List<MusicStyle>) musicStyleRepository.findAll();
    }

    public MusicStyle getMusicStyleById(Long id) {
        return musicStyleRepository.findById(id).orElse(null);
    }

    public MusicStyle createMusicStyle(MusicStyle musicStyle) {
        return musicStyleRepository.save(musicStyle);
    }

    // Other CRUD operations and service methods

}
