package com.pruebatec.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebatec.application.entities.VoteCount;
import com.pruebatec.application.repositories.VoteCountRepository;

@Service
public class VoteCountService {
    private final VoteCountRepository voteCountRepository;

    public VoteCountService(VoteCountRepository voteCountRepository) {
        this.voteCountRepository = voteCountRepository;
    }

    public List<VoteCount> getAllVoteCounts() {
        return (List<VoteCount>) voteCountRepository.findAll();
    }

    public VoteCount getVoteCountById(Integer id) {
        return voteCountRepository.findById(id).orElse(null);
    }

    public VoteCount createVoteCount(VoteCount voteCount) {
        return voteCountRepository.save(voteCount);
    }

    public VoteCount updateVoteCount(Integer id, VoteCount voteCount) {
        VoteCount existingVoteCount = voteCountRepository.findById(id).orElse(null);
        if (existingVoteCount != null) {
            // Update the existing vote count with new values
            existingVoteCount.setMusicStyle(voteCount.getMusicStyle());
          //  existingVoteCount.setVoteCount(voteCount.getVoteCount());
            return voteCountRepository.save(existingVoteCount);
        }
        return null;
    }

    public void deleteVoteCount(Integer id) {
        voteCountRepository.deleteById(id);
    }
}
