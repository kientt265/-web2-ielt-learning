package com.spring.fantasyielts.service.Section;

import org.bson.types.ObjectId;

import com.spring.fantasyielts.dto.Section.SectionAddDTO;
import com.spring.fantasyielts.entity.Section;

public interface ISectionService {
    Section getSectionById(ObjectId sectionId);
    Section addSection(SectionAddDTO seccAddDTO);
    
} 
