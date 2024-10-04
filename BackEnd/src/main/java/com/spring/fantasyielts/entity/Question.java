package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Document(collection= "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    private ObjectId _id;
    
    private String title;

    private Optional<String> imageUrl;

    private String type;

    private Optional<List<SubQuestion>> sub_questions;
}
