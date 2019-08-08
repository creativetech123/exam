package org.teracode.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teracode.exam.entities.Student;
import org.teracode.exam.services.StudentsService;

import java.util.Collection;

@RestController
@RequestMapping("/school")
public class SchoolController {
    private final StudentsService service;

    @Autowired
    public SchoolController(StudentsService service) {
        this.service = service;
    }

    @GetMapping("/filtered-students/{lastNameInitial}")
    public Collection<Student> getStudentsByLastnameInitial(@PathVariable("lastNameInitial") final String lastNameInitial) {
        return service.retrieveStudentsGroupedByLastNameInitial(lastNameInitial);
    }
}