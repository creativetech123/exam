package org.teracode.exam.services.implementations

import org.teracode.exam.daos.implementations.StudentsMockDao
import org.teracode.exam.mappers.StudentDTOMapper
import org.teracode.exam.mappers.SubjectDTOMapper
import org.teracode.exam.services.StudentsService
import spock.lang.Specification

class StudentsBasicServiceTest extends Specification {
    private StudentsService service

    void setup() {
        def studentDTOMapper = new StudentDTOMapper(new SubjectDTOMapper())
        service = new StudentsBasicService(new StudentsMockDao(), studentDTOMapper)
    }

    def "given a valid last name initial -> returns valid collection of students"() {
        given:
        def lastNameInitial = "r"

        when:
        def results = service.retrieveStudentsGroupedByLastNameInitial(lastNameInitial)

        then:
        noExceptionThrown()
        and:
        !results.isEmpty()
        and:
        results.stream()
                .filter({ s -> !s.getLastName().substring(0, 1).equalsIgnoreCase(lastNameInitial) })
                .collect()
                .isEmpty()
    }
}
