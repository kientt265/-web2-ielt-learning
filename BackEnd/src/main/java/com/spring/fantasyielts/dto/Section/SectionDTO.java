package com.spring.fantasyielts.dto.Section;

import com.spring.fantasyielts.dto.Part.PartDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.spring.fantasyielts.enums.SectionTypes;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SectionDTO {
    private String title;

    private SectionTypes type;

    @DocumentReference
    private List<PartDTO> parts;

}
