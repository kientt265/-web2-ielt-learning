package com.spring.fantasyielts.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "test_series")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestSerie {
    @Id
    private ObjectId _id;

    private String title;

    private String edition;

    private String publisher;

    private String coverImageUrl;

    private Integer numberOfTest;
    
    private Integer seriesNumber;
   
    private List<Test> tests;
    
}
