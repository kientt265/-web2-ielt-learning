package com.spring.fantasyielts.dto.SubQuestion;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubQuestionDTO {
    private String title;

    private String answer;

    private List<String> options;
}
