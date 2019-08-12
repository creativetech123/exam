package org.teracode.exam.mappers;

import org.springframework.stereotype.Component;
import org.teracode.exam.entities.Subject;
import org.teracode.exam.responses.dtos.SubjectDTO;

@Component
public class SubjectMapper {
    public Subject from(final SubjectDTO dto) {
        final var entity = new Subject();
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        return entity;
    }
}
