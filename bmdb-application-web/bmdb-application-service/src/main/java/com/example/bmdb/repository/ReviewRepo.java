package com.example.bmdb.repository;

import com.example.bmdb.domain.Review;
import com.example.bmdb.domain.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Long> {
	List<Review> findAllByCreator(User creator);
}
