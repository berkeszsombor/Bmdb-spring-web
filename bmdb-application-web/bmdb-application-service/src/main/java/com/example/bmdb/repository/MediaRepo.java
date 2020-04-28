package com.example.bmdb.repository;

import com.example.bmdb.domain.Media;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MediaRepo extends CrudRepository<Media, Long> {
}
