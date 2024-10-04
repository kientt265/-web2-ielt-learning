package com.spring.fantasyielts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.entity.TestSerie;
import com.spring.fantasyielts.repository.TestSerieResponsitory;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

@Service
public class TestSerieService {
    @Autowired
    private TestSerieResponsitory testSerieResponsitory;

    public List<TestSerie> allTestSeries() {
        return testSerieResponsitory.findAll();
    }

    public TestSerie testSerieById(ObjectId objectId) throws NotFoundException {
        Optional<TestSerie> testSerie = testSerieResponsitory.findById(objectId);
        if (!testSerie.isPresent()) {
            throw new NotFoundException();
        } else {
            return testSerie.get();
        }
    }
}
