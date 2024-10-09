package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.util.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spring.fantasyielts.util.ObjectIdDeserializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection= "tests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    private ObjectId _id;

    private String title;

    private String publishDate;

    @DocumentReference
    private Section speakingSection;

    @DocumentReference
    private Section listeningSection;

    @DocumentReference
    private Section readingSection;

    @DocumentReference
    private Section writingSection;
}
