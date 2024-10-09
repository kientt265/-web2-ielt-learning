package com.spring.fantasyielts.dto.Part;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.Question.QuestionDTO;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartDTO {
    @Id
    private ObjectId _id;

    private String title;

    private String type;

    private String audioData;

    private List<String> paragraphs;

    @DocumentReference
    private List<QuestionDTO> questions;

    public void addQuestions(QuestionDTO questionDTO) {
        this.questions.add(questionDTO);
    }
}
