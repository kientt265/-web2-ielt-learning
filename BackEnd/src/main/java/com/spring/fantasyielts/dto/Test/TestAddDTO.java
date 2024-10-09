package com.spring.fantasyielts.dto.Test;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.Section.SectionAddDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestAddDTO {
    private String title;

    private String publishDate;

    @DocumentReference
    private SectionAddDTO speakingSection;

    @DocumentReference
    private SectionAddDTO listeningSection;

    @DocumentReference
    private SectionAddDTO readingSection;

    @DocumentReference
    private SectionAddDTO writingSection;
}
