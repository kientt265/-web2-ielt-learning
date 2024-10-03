package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document(collection= "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    private ObjectId _id;
    
    private String title;

    private String type;

    private List<SubQuestion> sub_questions;
}
