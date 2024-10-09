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
import com.spring.fantasyielts.dto.SubQuestion.SubQuestionAddDTO;
import com.spring.fantasyielts.entity.SubQuestion;
import com.spring.fantasyielts.service.SubQuestion.SubQuestionService;

@RestController
@RequestMapping(EndPoint.SubQuestion.BASE)
public class SubQuestionController {
    @Autowired
    private SubQuestionService subQuestionService;

    @GetMapping(EndPoint.SubQuestion.ID)
    public ResponseEntity<SubQuestion> getSubquestionById(@PathVariable("subQuestionId") String questionId) throws NotFoundException {
        return new ResponseEntity<>(subQuestionService.getSubQuestionById(new ObjectId(questionId)), HttpStatus.OK);
    }

    @PostMapping(EndPoint.SubQuestion.ADD)
    public ResponseEntity<SubQuestion> addSubQuestion(@RequestBody SubQuestionAddDTO subQuestionAddDTO) {
        return new ResponseEntity<>(subQuestionService.addSubQuestion(subQuestionAddDTO), HttpStatus.OK);
    }
}
