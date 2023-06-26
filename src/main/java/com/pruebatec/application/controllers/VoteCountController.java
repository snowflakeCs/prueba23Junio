package com.pruebatec.application.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatec.application.entities.VoteCount;
import com.pruebatec.application.services.VoteCountService;

@RestController
@RequestMapping("/api/vote-counts")
public class VoteCountController {
    private final VoteCountService voteCountService;

    public VoteCountController(VoteCountService voteCountService) {
        this.voteCountService = voteCountService;
    }

    @GetMapping
    public ResponseEntity<List<VoteCount>> getAllVoteCounts() {
        List<VoteCount> voteCounts = voteCountService.getAllVoteCounts();
        return ResponseEntity.ok(voteCounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VoteCount> getVoteCountById(@PathVariable("id") Integer id) {
        VoteCount voteCount = voteCountService.getVoteCountById(id);
        if (voteCount == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(voteCount);
    }

    // Other CRUD operations and endpoints
}
