package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Document(collection= "sub_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubQuestion  {
    @Id
    private ObjectId _id;

    private String title;

    private Optional<String> answer;

    private Optional<List<String>> options;
}
