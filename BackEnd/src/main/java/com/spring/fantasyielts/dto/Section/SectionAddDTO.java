package com.spring.fantasyielts.dto.Section;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import com.spring.fantasyielts.dto.Part.PartAddDTO;
import com.spring.fantasyielts.enums.SectionTypes;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionAddDTO {
    private String title;
    
    private SectionTypes type;

    @DocumentReference
    private List<PartAddDTO> parts;
}
