package com.pruebatec.application.services;
import org.springframework.stereotype.Service;

import com.pruebatec.application.entities.MusicStyle;
import com.pruebatec.application.repositories.MusicStyleRepository;

import java.util.List;

@Service
public class MusicStyleService {

    private final MusicStyleRepository musicStyleRepository;

    public MusicStyleService(MusicStyleRepository musicStyleRepository) {
        this.musicStyleRepository = musicStyleRepository;
    }

    public List<MusicStyle> getAllMusicStyles() {
        return (List<MusicStyle>) musicStyleRepository.findAll();
    }

    public MusicStyle getMusicStyleById(Integer id) {
        return musicStyleRepository.findById(id).orElse(null);
    }

    public MusicStyle createMusicStyle(MusicStyle musicStyle) {
        return musicStyleRepository.save(musicStyle);
    }

    // Other CRUD operations and service methods

}
