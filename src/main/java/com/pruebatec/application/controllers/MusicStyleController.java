package com.pruebatec.application.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pruebatec.application.entities.MusicStyle;
import com.pruebatec.application.services.MusicStyleService;

import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicStyleController {

    private final MusicStyleService musicStyleService;

    public MusicStyleController(MusicStyleService musicStyleService) {
        this.musicStyleService = musicStyleService;
    }

    @GetMapping
    public ResponseEntity<List<MusicStyle>> getAllMusicStyles() {
        List<MusicStyle> musicStyles = musicStyleService.getAllMusicStyles();
        return ResponseEntity.ok(musicStyles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicStyle> getMusicStyleById(@PathVariable("id") Integer id) {
        MusicStyle musicStyle = musicStyleService.getMusicStyleById(id);
        if (musicStyle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(musicStyle);
    }

    @PostMapping
    public ResponseEntity<MusicStyle> createMusicStyle(@RequestBody MusicStyle musicStyle) {
        MusicStyle createdMusicStyle = musicStyleService.createMusicStyle(musicStyle);
        return ResponseEntity.ok(createdMusicStyle);
    }

    // Other CRUD operations and endpoints

}
