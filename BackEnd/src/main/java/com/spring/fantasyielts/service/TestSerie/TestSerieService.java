package com.spring.fantasyielts.service.TestSerie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.entity.Test;
import com.spring.fantasyielts.entity.TestSerie;
import com.spring.fantasyielts.repository.TestSerieRespository;

import java.util.List;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;

import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.dto.TestSerie.TestSerieAddDTO;
import com.spring.fantasyielts.repository.PartRepository;
import com.spring.fantasyielts.repository.SectionRepository;
import com.spring.fantasyielts.service.Test.TestService;


@Service
public class TestSerieService implements ITestSerie {
    @Autowired
    private TestSerieRespository testSerieRespository;

    @Autowired
    private TestService testService;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private PartRepository partRepository;

    @Autowired
    private ModelMapper mapper;

    public List<TestSerie> getAllTestSeries() {
        return testSerieRespository.findAll();
    }

    @Override
    public TestSerie getTestSerieById(ObjectId testId) {
        return testSerieRespository.findById(testId).get();
    }

    @Override
    public TestSerie createTestSerie(TestSerieAddDTO testSerieAddDTO) {

        return testSerieRespository.insert(mapper.map(testSerieAddDTO, TestSerie.class));
    }

    @Override
    public TestSerie addTestIntoTestSerie(ObjectId testSerieId, TestAddDTO testAddDTO){
        TestSerie testSerie = testSerieRespository.findById(testSerieId).get();

        testSerie.addTest(testService.initTest(testAddDTO));
        return testSerieRespository.save(testSerie);
    }

    @Override
    public List<Test> getAllTests(ObjectId testSerieId) {
        TestSerie testSerie = testSerieRespository.findById(testSerieId).get();
        
        return testSerie.getTests();
    }

 }
