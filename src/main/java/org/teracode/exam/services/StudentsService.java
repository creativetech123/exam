package org.teracode.exam.services;

import org.teracode.exam.entities.Student;

import java.util.Collection;

public interface StudentsService {
    Collection<Student> retrieveStudentsGroupedByLastNameInitial(final String lastNameInitial);
}
