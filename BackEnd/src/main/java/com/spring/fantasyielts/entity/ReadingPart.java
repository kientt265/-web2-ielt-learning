package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document(collection= "reading_passage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReadingPart {
    @Id
    private ObjectId _id;

    private String title;;

    private List<String> paragraphs;

    private List<Question> questions;
}
