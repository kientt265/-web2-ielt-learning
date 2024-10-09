package com.spring.fantasyielts.dto.TestSerie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.spring.fantasyielts.dto.Test.TestDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestSerieDTO {
    private String title;

    private String edition;
    
    private String publisher;

    private String coverImageUrl;

    private Integer numberOfTest;

    private Integer seriesNumber;

    private List<TestDTO> tests;
}
