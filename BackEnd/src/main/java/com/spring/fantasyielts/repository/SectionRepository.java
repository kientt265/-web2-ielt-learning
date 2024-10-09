package com.spring.fantasyielts.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.fantasyielts.entity.Section;

@Repository
public interface SectionRepository extends MongoRepository<Section, ObjectId> {
    
}
