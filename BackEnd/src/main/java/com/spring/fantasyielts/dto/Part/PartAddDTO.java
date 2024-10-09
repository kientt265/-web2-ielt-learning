package com.spring.fantasyielts.dto.Part;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.Question.QuestionAddDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartAddDTO {

    private String title;

    private String type;

    private String audioData;

    private List<String> paragraphs;

    @DocumentReference
    private List<QuestionAddDTO> questions;
}
