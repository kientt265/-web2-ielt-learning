package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection= "speaking_sections")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpeakingSection {
    @Id
    private ObjectId _id;

    private ObjectId taskOne;

    private ObjectId taskTwo;

    private ObjectId taskThree;
}
