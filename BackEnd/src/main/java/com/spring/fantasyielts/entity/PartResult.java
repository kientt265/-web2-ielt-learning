package com.spring.fantasyielts.entity;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "part_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartResult {
    @Id
    private ObjectId _id;

    private double score;

    private int questionNumber;

    private int correctQuestionNumber;

    @DocumentReference
    private List<QuestionResult> questionResults;
}
