package com.spring.fantasyielts.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "question_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResult {
    @Id
    private ObjectId _id;

    @DocumentReference
    private List<SubQuestionResult> subQuestionResults;
}

