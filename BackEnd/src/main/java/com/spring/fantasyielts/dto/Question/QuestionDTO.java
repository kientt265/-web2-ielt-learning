package com.spring.fantasyielts.dto.Question;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.SubQuestion.SubQuestionDTO;
import com.spring.fantasyielts.entity.SubQuestion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
     private String title;

    private String imageData;

    private String type;

    @DocumentReference
    private List<SubQuestionDTO> subQuestions;
}
