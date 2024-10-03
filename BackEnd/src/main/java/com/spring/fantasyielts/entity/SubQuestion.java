package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection= "sub_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubQuestion  {
    @Id
    private ObjectId _id;

    private String title;

    private String answer;
}
