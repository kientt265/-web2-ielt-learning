package com.spring.fantasyielts.service.Question;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Question.QuestionAddDTO;
import com.spring.fantasyielts.dto.Question.QuestionDTO;
import com.spring.fantasyielts.dto.SubQuestion.SubQuestionAddDTO;
import com.spring.fantasyielts.entity.Question;
import com.spring.fantasyielts.entity.SubQuestion;
import com.spring.fantasyielts.repository.QuestionRepository;
import com.spring.fantasyielts.service.SubQuestion.SubQuestionService;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SubQuestionService subQuestionService;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Question getQuestionById(ObjectId sectionId) { 
        return questionRepository.findById(sectionId).get();
    }

    private QuestionDTO convertToQuestionDTO(Question question) throws NotFoundException {
        QuestionDTO questionDTO = new QuestionDTO();

        mapper.map(question, questionDTO);

        return questionDTO;
    }

    @Override
    public Question addQuestion(QuestionAddDTO questionAddDTO) {
        Question question = new Question();
        List<SubQuestion> subQuestions = new ArrayList<>();

        for (SubQuestionAddDTO subQuestionAddDTO : questionAddDTO.getSubQuestions()){
            subQuestions.add(subQuestionService.addSubQuestion(subQuestionAddDTO)); 
        }    
        
        mapper.map(questionAddDTO, question);

        question.setSubQuestions(subQuestions);

        return questionRepository.insert(question);
    }
 }
