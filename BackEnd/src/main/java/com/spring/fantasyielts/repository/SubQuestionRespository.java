package com.spring.fantasyielts.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.fantasyielts.entity.SubQuestion;


@Repository
public interface SubQuestionRespository extends MongoRepository<SubQuestion, ObjectId> {
}
