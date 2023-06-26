package com.pruebatec.application.repositories;
import com.pruebatec.application.entities.VoteCount;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteCountRepository extends CrudRepository<VoteCount, Integer> {
    @Query("SELECT v.musicStyle, COUNT(v) FROM VoteCount v GROUP BY v.musicStyle")
    List<Object[]> countVotesByMusicStyle();
}
