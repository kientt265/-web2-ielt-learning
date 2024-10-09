package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.spring.fantasyielts.util.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spring.fantasyielts.util.ObjectIdDeserializer;

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
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    private ObjectId _id;
    
    private String title;

    private String imageData;

    private String type;

    @DocumentReference
    private List<SubQuestion> subQuestions;
}
