package com.company.project.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.project.assignment.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}