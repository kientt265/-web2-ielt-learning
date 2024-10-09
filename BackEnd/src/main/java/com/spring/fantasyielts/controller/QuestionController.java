package com.spring.fantasyielts.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Question.QuestionAddDTO;
import com.spring.fantasyielts.entity.Question;
import com.spring.fantasyielts.service.Question.QuestionService;

@RestController
@RequestMapping(EndPoint.Question.BASE)
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping(EndPoint.Question.ID)
    public ResponseEntity<Question> getQuestionById(@PathVariable("questionId") String questionId) {
        return new ResponseEntity<>(questionService.getQuestionById(new ObjectId(questionId)), HttpStatus.OK);
    }

    @PostMapping(EndPoint.Question.ADD)
    public ResponseEntity<Question> getQuestionById(@RequestBody QuestionAddDTO questionAddDTO) {
        return new ResponseEntity<>(questionService.addQuestion(questionAddDTO), HttpStatus.OK);
    }
}
