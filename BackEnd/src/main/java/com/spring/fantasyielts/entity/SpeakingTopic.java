package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document(collection= "speaking_topic")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpeakingTopic {
    @Id
    private ObjectId _id;

    private String topic;

    private List<String> questions;
}
