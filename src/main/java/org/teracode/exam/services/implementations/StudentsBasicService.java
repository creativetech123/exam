package org.teracode.exam.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teracode.exam.daos.StudentsDao;
import org.teracode.exam.entities.Student;
import org.teracode.exam.services.StudentsService;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class StudentsBasicService implements StudentsService {
    private final StudentsDao dao;

    @Autowired
    public StudentsBasicService(StudentsDao dao) {
        this.dao = dao;
    }

    @Override
    public Collection<Student> retrieveStudentsGroupedByLastNameInitial(final String lastNameInitial) {
        return dao.getStudents()
                .stream()
                .filter(s -> s.getFirstName().substring(0, 1).equals(lastNameInitial))
                .collect(Collectors.toList());
    }
}
