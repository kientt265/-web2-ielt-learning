package com.spring.fantasyielts.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.dto.TestSerie.TestSerieAddDTO;
import com.spring.fantasyielts.entity.Test;
import com.spring.fantasyielts.entity.TestSerie;
import com.spring.fantasyielts.service.TestSerie.TestSerieService;

@RestController
@RequestMapping(EndPoint.TestSerie.BASE)
public class TestSerieController {
    @Autowired
    private TestSerieService testSerieService;

    @GetMapping
    public ResponseEntity<List<TestSerie>> getAllTestSeries() {
        return new ResponseEntity<List<TestSerie>>(testSerieService.getAllTestSeries(), HttpStatus.OK);
    }

    @GetMapping(EndPoint.TestSerie.ID) 
    public ResponseEntity<TestSerie> getTestSerieById(@PathVariable("testSerieId") String id) {
        return new ResponseEntity<TestSerie>(testSerieService.getTestSerieById(new ObjectId(id)), HttpStatus.OK);
    }

    @GetMapping(EndPoint.TestSerie.GET_ALL_TESTS) 
    public ResponseEntity<List<Test>> getAllTests(@PathVariable("testSerieId") String id) {
        return new ResponseEntity<>(testSerieService.getAllTests(new ObjectId(id)), HttpStatus.OK);
    }

    @PostMapping(EndPoint.TestSerie.CREATE)
    public ResponseEntity<TestSerie> createTestSerie(@RequestBody TestSerieAddDTO testSerieAddDTO) {
        return new ResponseEntity<>(testSerieService.createTestSerie(testSerieAddDTO), HttpStatus.OK);
    }   

    @PutMapping(EndPoint.TestSerie.ADD_TEST)
    public ResponseEntity<TestSerie> addTestIntoTestSerie(@PathVariable("testSerieId") String testSerieId,@RequestBody TestAddDTO testAddDTO) {
        return new ResponseEntity<>(testSerieService.addTestIntoTestSerie(new ObjectId(testSerieId), testAddDTO), HttpStatus.OK);
    }   
}
