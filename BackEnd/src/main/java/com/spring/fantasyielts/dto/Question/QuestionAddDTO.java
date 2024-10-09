package com.spring.fantasyielts.dto.Question;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.SubQuestion.SubQuestionAddDTO;
import com.spring.fantasyielts.entity.SubQuestion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAddDTO {
     private String title;

    private String imageData;

    private String type;

    @DocumentReference
    private List<SubQuestionAddDTO> subQuestions;
}
