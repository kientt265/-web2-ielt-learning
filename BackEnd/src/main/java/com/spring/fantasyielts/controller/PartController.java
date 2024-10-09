package com.spring.fantasyielts.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.constant.EndPoint;
import com.spring.fantasyielts.dto.Part.PartAddDTO;
import com.spring.fantasyielts.dto.Part.PartDTO;
import com.spring.fantasyielts.entity.Part;
import com.spring.fantasyielts.service.PartService;

@RestController
@RequestMapping(EndPoint.Part.BASE)
public class PartController {
    @Autowired
    private PartService partService;


    @GetMapping(EndPoint.Part.ID)
    public ResponseEntity<Part> getPartContentById(@PathVariable("partId") ObjectId objectId) throws NotFoundException {
        return new ResponseEntity<>(partService.partById(objectId), HttpStatus.OK);
    }

    @PostMapping(EndPoint.Part.ADD)
    public ResponseEntity<Part> addPart(@RequestBody PartAddDTO partAddDTO) {
        return new ResponseEntity<>(partService.add(partAddDTO), HttpStatus.CREATED);
    }

}
