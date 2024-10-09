package com.spring.fantasyielts.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Section.SectionAddDTO;
import com.spring.fantasyielts.entity.Section;
import com.spring.fantasyielts.service.Section.SectionService;

@RestController
@RequestMapping(EndPoint.Section.BASE)
public class SectionController {
    @Autowired
    private SectionService sectionService;

     @GetMapping(EndPoint.Section.ID)
    public ResponseEntity<Section> getSectionById(@PathVariable("sectionId") String sectionId) throws NotFoundException {
        return new ResponseEntity<>(sectionService.getSectionById(new ObjectId(sectionId)), HttpStatus.OK);
    }
    
    @PostMapping(EndPoint.Section.ADD)
    public ResponseEntity<Section> addSection(@RequestBody SectionAddDTO sectionAddDTO) throws NotFoundException {
        return new ResponseEntity<>(sectionService.addSection(sectionAddDTO), HttpStatus.OK);
    }
}
