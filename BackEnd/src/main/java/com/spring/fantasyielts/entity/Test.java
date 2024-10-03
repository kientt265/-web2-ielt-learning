package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection= "test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @Id
    private ObjectId _id;

    private String title;

    private String serieId;

    private String publishDate;

    private ObjectId speakingSectionId;

    private ObjectId listeningSectionId;

    private ObjectId readingSectionId;

    private ObjectId writingSectiId;


}
