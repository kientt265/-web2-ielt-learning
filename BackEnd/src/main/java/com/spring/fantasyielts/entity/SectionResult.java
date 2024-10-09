package com.spring.fantasyielts.entity;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "section_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionResult {
    @Id
    private ObjectId _id;

    private String score;

    @DocumentReference
    private List<PartResult> PartResult;
}
