package com.spring.fantasyielts.service.SubQuestion;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.dto.SubQuestion.SubQuestionAddDTO;
import com.spring.fantasyielts.dto.SubQuestion.SubQuestionDTO;
import com.spring.fantasyielts.entity.SubQuestion;
import com.spring.fantasyielts.repository.SubQuestionRespository;
import com.spring.fantasyielts.responses.APIResponse;

@Service
public class SubQuestionService implements ISubQuestionService {
    @Autowired
    private SubQuestionRespository subQuestionResponsitory;

    @Autowired
    private ModelMapper mapper;

    @Override
    public SubQuestion getSubQuestionById(ObjectId objectId)  {
        return subQuestionResponsitory.findById(objectId).get();
    }

    @Override
    public SubQuestion addSubQuestion(SubQuestionAddDTO subQuestionAddDTO) {
        SubQuestion subQuestion = new SubQuestion();

        mapper.map(subQuestionAddDTO, subQuestion);

        return subQuestionResponsitory.insert(subQuestion);
    }

    public SubQuestion updateSubquestion(ObjectId subQuestionId ,SubQuestionDTO subQuestionDTO) throws NotFoundException {
        SubQuestion subQuestion = subQuestionResponsitory.findById(subQuestionId).orElseThrow(() -> new NotFoundException());

        mapper.map(subQuestionDTO, subQuestion);

        return subQuestionResponsitory.save(subQuestion);
    }

    
}
