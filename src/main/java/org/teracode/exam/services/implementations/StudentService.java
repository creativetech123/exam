package org.teracode.exam.services.implementations;

import org.teracode.exam.entities.Student;
import org.teracode.exam.services.StudentsService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService implements StudentsService {
    @Override
    public Collection<Student> retrieveStudentsGroupedByLastNameInitial(final String lastNameInitial) {
        final Collection<Student> students = List.of(new Student(), new Student(), new Student());

        return students.stream()
                .filter(s -> s.getFirstName().substring(0, 1).equals(lastNameInitial))
                .collect(Collectors.toList());
    }
}
