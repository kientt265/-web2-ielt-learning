package com.spring.fantasyielts.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document(collection="writing_sections")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WritingSection {
    @Id
    private ObjectId _id;

    private List<Question> quetions;
}
