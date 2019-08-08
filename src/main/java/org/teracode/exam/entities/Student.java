package org.teracode.exam.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private Collection<Subject> subjects;

    public Student() {
        this.subjects = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Collection<Subject> getSubjects() {
        return List.copyOf(subjects);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
