package com.example.bmdb.repository;

import com.example.bmdb.domain.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findByName(String name);
}
