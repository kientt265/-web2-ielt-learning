package com.spring.fantasyielts.service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.dto.Part.PartAddDTO;
import com.spring.fantasyielts.dto.Part.PartDTO;
import com.spring.fantasyielts.dto.Question.QuestionAddDTO;
import com.spring.fantasyielts.entity.Part;
import com.spring.fantasyielts.entity.Question;
import com.spring.fantasyielts.repository.PartRepository;
import com.spring.fantasyielts.repository.QuestionRepository;
import com.spring.fantasyielts.repository.SubQuestionRespository;
import com.spring.fantasyielts.service.Question.QuestionService;

@Service
public class PartService {
    @Autowired
    private PartRepository partRespository;

    private final QuestionService questionService;

    @Autowired
    public PartService(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Autowired
    private ModelMapper mapper;

    public Part partById(ObjectId objectId) {        
        return partRespository.findById(objectId).get();
    } 

    public Part add(PartAddDTO partAddDTO) {
        Part part = new Part();
        List<Question> questions = new ArrayList<>();

        for (QuestionAddDTO questionAddDTO : partAddDTO.getQuestions()){
            questions.add(questionService.addQuestion(questionAddDTO)); 
        }

        mapper.map(partAddDTO, part);

        part.setQuestions(questions);

        return partRespository.insert(part);
    }
    
}
