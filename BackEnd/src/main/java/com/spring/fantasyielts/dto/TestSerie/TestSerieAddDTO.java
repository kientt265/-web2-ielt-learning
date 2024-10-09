package com.spring.fantasyielts.dto.TestSerie;

import java.util.List;

import com.spring.fantasyielts.dto.Test.TestAddDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestSerieAddDTO {
    private String title;

    private String publisher;

    private String coverImageUrl;

    private Integer serieNumber;

    private List<TestAddDTO> tests;
}
