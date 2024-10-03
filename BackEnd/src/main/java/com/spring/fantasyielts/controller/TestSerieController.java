package com.spring.fantasyielts.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.service.TestSerieService;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.spring.fantasyielts.entity.TestSerie;

@RestController
@RequestMapping("/api/testSeries" )
public class TestSerieController {
    @Autowired
    private TestSerieService testSerieService;

    @GetMapping
    public ResponseEntity<List<TestSerie>> getAllTestSeries() {
        return new ResponseEntity<List<TestSerie>>(testSerieService.allTestSeries(), HttpStatus.OK);
    }
}
