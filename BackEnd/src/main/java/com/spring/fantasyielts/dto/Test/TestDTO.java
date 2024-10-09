package com.spring.fantasyielts.dto.Test;


import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.dto.Section.SectionDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDTO {
    private String title;

    private String publishDate;

    @DocumentReference
    private SectionDTO speakingSection;

    @DocumentReference
    private SectionDTO listeningSection;

    @DocumentReference
    private SectionDTO readingSection;

    @DocumentReference
    private SectionDTO writingSection;
}
