package com.spring.fantasyielts.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Section.SectionAddDTO;
import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.entity.Test;
import com.spring.fantasyielts.service.Test.TestService;


@RestController
@RequestMapping(EndPoint.Test.BASE)
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(EndPoint.Test.ID)
    public ResponseEntity<Test> getTestById(@PathVariable("testId") String id) throws NotFoundException {
        return new ResponseEntity<>(testService.getTestById(new ObjectId(id)), HttpStatus.OK);
    }

    @PostMapping(EndPoint.Test.INIT)
    public ResponseEntity<?> addTest(@RequestBody TestAddDTO testAddDTO) {
        return new ResponseEntity<>(testService.initTest(testAddDTO), HttpStatus.OK);
    }

    @PutMapping(EndPoint.Test.UPLOAD_TEST)
    public ResponseEntity<?>uploadTest(@PathVariable("testId") String sectionId, @RequestBody SectionAddDTO sectionAddDTO) throws NotFoundException {
        return new ResponseEntity<>(testService.uploadSectionsOfTest(new ObjectId(sectionId), sectionAddDTO), HttpStatus.OK);
    }
}