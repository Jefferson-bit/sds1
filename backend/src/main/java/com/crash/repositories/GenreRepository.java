package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crash.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
