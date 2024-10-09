package com.spring.fantasyielts.service.TestSerie;

import org.bson.types.ObjectId;

import java.util.List;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.dto.TestSerie.TestSerieAddDTO;
import com.spring.fantasyielts.entity.Test;
import com.spring.fantasyielts.entity.TestSerie;

public interface ITestSerie {
    public TestSerie getTestSerieById(ObjectId testSerieId);
    public TestSerie createTestSerie(TestSerieAddDTO testSerieAddDTO);
    public TestSerie addTestIntoTestSerie(ObjectId testSerieId, TestAddDTO testAddDTO);
    public List<Test> getAllTests(ObjectId testId);
}
