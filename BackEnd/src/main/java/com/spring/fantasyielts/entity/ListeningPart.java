package com.spring.fantasyielts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListeningPart {
    @Id
    private ObjectId _id;

    private String recordUrl;

    private List<Question> questions;
}
