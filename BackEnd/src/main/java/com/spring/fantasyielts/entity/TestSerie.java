package com.spring.fantasyielts.entity;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.annotation.Id;

import com.spring.fantasyielts.util.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spring.fantasyielts.util.ObjectIdDeserializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "test_series")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestSerie {
    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    private ObjectId _id;

    private String title;

    private String edition;

    private String publisher;

    private String coverImageUrl;

    private Integer numberOfTest;
    
    private Integer seriesNumber;
   
    @DocumentReference(collection= "tests")
    private List<Test> tests;

    public void addTest(Test test) {
        if (tests == null) {
        tests = new ArrayList<>(); 
        }
        tests.add(test);
    }
    
}
