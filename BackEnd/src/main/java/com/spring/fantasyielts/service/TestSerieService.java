package com.spring.fantasyielts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.entity.TestSerie;
import com.spring.fantasyielts.repository.TestSerieResponsitory;
import java.util.List;

@Service
public class TestSerieService {
    @Autowired
    private TestSerieResponsitory testSerieResponsitory;

    public List<TestSerie> allTestSeries() {
        return testSerieResponsitory.findAll();
    }

    public String demo() {
        return "String demo";
    }
}
