package com.example.bmdb.repository;

import com.example.bmdb.domain.Actor;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepo extends CrudRepository<Actor, Long> {
}
