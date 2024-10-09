package com.spring.fantasyielts.responses.Question;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.spring.fantasyielts.entity.SubQuestion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionResponse {
    @Id
    private ObjectId _id;

    private String title;

    private String imageData;

    private String type;

    private List<SubQuestion> subQuestions;
}
