package org.teracode.exam.daos.implementations;

import org.springframework.stereotype.Repository;
import org.teracode.exam.daos.StudentsDao;
import org.teracode.exam.entities.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class StudentsMockDao implements StudentsDao {
    @Override
    public Collection<Student> getStudents() {
        return List.of(
                createStudent("Peter", "Robinson"),
                createStudent("David", "Hudson"),
                createStudent("Mike", "Thompson"),
                createStudent("Ross", "Jackson"),
                createStudent("Joey", "Trump"),
                createStudent("Steven", "Peterson")
        );
    }

    private Student createStudent(final String firstName, final String lastName) {
        final var student = new Student();
        student.setId(ThreadLocalRandom.current().nextLong());
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setBirth(generateRandomDate());
        return student;
    }

    private LocalDate generateRandomDate() {
        final var initialDate = LocalDate.of(1950, 1, 1);
        final var finalDate = LocalDate.of(2010, 12, 31);

        final long days = initialDate.until(finalDate, ChronoUnit.DAYS);
        final long randomDays = ThreadLocalRandom.current().nextLong(days + 1);

        return initialDate.plusDays(randomDays);
    }
}
