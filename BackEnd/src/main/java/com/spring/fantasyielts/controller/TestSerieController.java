package com.spring.fantasyielts.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.service.TestSerieService;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.spring.fantasyielts.entity.TestSerie;

@RestController
@RequestMapping("/testSeries")
public class TestSerieController {
    @Autowired
    private TestSerieService testSerieService;

    @GetMapping
    public ResponseEntity<List<TestSerie>> getAllTestSeries() {
        return new ResponseEntity<List<TestSerie>>(testSerieService.allTestSeries(), HttpStatus.OK);
    }

    @GetMapping("/{id}") 
    public ResponseEntity<TestSerie> getTestSerieById(@PathVariable("id") String id) throws NotFoundException {
        return new ResponseEntity<TestSerie>(testSerieService.testSerieById(new ObjectId(id)), HttpStatus.OK);
    }

}
