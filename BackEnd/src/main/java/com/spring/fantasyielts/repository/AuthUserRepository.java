package com.spring.fantasyielts.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.fantasyielts.entity.AuthUser;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends MongoRepository<AuthUser, ObjectId> {
    Optional<AuthUser> findByUsername(String username);
    
}
