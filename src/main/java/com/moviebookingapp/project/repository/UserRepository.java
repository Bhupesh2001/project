package com.moviebookingapp.project.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.moviebookingapp.project.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}