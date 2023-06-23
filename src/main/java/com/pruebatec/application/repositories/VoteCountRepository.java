package com.pruebatec.application.repositories;
import com.pruebatec.application.entities.VoteCount;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface VoteCountRepository extends CrudRepository<VoteCount, Long> {
    @Query("SELECT v.musicStyle, COUNT(v) FROM VoteCount v GROUP BY v.musicStyle")
    List<Object[]> countVotesByMusicStyle();
}
