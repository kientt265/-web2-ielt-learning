package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "subquestion_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubQuestionResult {
    @Id
    private ObjectId _id;

    private String answer;
}
