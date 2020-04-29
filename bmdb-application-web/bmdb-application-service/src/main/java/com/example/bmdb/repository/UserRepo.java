package com.example.bmdb.repository;

import com.example.bmdb.domain.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
    void deleteByEmail(String email);
}
