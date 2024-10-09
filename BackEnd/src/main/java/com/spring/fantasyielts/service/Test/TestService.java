package com.spring.fantasyielts.service.Test;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.repository.TestRepository;
import com.spring.fantasyielts.service.Section.SectionService;
import com.spring.fantasyielts.util.LocalizationUtil;
import com.spring.fantasyielts.entity.Test;


import org.modelmapper.ModelMapper;

import com.spring.fantasyielts.dto.Section.SectionAddDTO;
import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.enums.SectionTypes;
import com.spring.fantasyielts.repository.SectionRepository;

@Service
public class TestService implements ITestService {
    @Autowired
    private TestRepository testRepository;

    @Autowired
    private SectionService sectionService;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private LocalizationUtil localizationUtil;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Test getTestById(ObjectId objectId) {
        return testRepository.findById(objectId).get();
    }

    public Test initTest(TestAddDTO testAddDTO) {
        return testRepository.insert(mapper.map(testAddDTO, Test.class));
    }

    public Test uploadSectionsOfTest(ObjectId testId ,SectionAddDTO sectionAddDTO) {
        Test test = testRepository.findById(testId).get();

        switch (sectionAddDTO.getType()) {
            case SectionTypes.SPEAKING -> test.setSpeakingSection(sectionService.addSection(sectionAddDTO));
            case SectionTypes.LISTENING -> test.setListeningSection(sectionService.addSection(sectionAddDTO));
            case SectionTypes.READING -> test.setReadingSection(sectionService.addSection(sectionAddDTO));
            case SectionTypes.WRITING -> test.setWritingSection(sectionService.addSection(sectionAddDTO));
            default -> throw new AssertionError();
        }

        return testRepository.save(test);
    }

}
