package com.spring.fantasyielts.service.Question;

import org.bson.types.ObjectId;

import com.spring.fantasyielts.dto.Question.QuestionAddDTO;
import com.spring.fantasyielts.entity.Question;

public interface IQuestionService {
    Question getQuestionById(ObjectId questionId);
    Question addQuestion(QuestionAddDTO questionAddDTO);
}
