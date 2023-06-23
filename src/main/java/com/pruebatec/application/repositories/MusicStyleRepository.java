package com.pruebatec.application.repositories;
import com.pruebatec.application.entities.MusicStyle;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface MusicStyleRepository extends CrudRepository<MusicStyle, Long> {
    List<MusicStyle> findAllByOrderByVotesDesc();
}
