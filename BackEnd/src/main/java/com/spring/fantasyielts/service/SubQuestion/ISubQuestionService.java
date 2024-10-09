package com.spring.fantasyielts.service.SubQuestion;

import org.bson.types.ObjectId;

import com.spring.fantasyielts.dto.SubQuestion.SubQuestionAddDTO;
import com.spring.fantasyielts.entity.SubQuestion;
import com.spring.fantasyielts.responses.APIResponse;

public interface  ISubQuestionService {
    SubQuestion getSubQuestionById(ObjectId subQuestionId);
    SubQuestion addSubQuestion(SubQuestionAddDTO subQuestionAddDTO);
}
