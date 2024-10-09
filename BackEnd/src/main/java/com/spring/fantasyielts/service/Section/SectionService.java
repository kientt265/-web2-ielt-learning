package com.spring.fantasyielts.service.Section;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.dto.Part.PartAddDTO;
import com.spring.fantasyielts.dto.Part.PartDTO;
import com.spring.fantasyielts.dto.Section.SectionAddDTO;
import com.spring.fantasyielts.dto.Section.SectionDTO;
import com.spring.fantasyielts.entity.Part;
import com.spring.fantasyielts.entity.Section;
import com.spring.fantasyielts.repository.PartRepository;
import com.spring.fantasyielts.repository.SectionRepository;
import com.spring.fantasyielts.service.PartService;

@Service
public class SectionService implements ISectionService {
    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private final PartService partService;

    @Autowired
    public SectionService(PartService partService) {
        this.partService = partService;
    }

    @Autowired
    private ModelMapper mapper;

    @Override
    public Section getSectionById(ObjectId objectId) {
        return sectionRepository.findById(objectId).get();
    } 

    @Override
    public Section addSection(SectionAddDTO sectionAddDTO) {
        Section section = new Section();
        List<Part> parts = new ArrayList<>();

        for (PartAddDTO partAddDTO : sectionAddDTO.getParts()) {
            parts.add(partService.add(partAddDTO));
        }

        mapper.map(sectionAddDTO, section);

        section.setParts(parts);

        return sectionRepository.insert(section);
    } 
}
