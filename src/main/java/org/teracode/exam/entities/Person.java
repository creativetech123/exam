package org.teracode.exam.entities;

import java.time.LocalDate;

abstract class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate birth;

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final LocalDate getBirth() {
        return birth;
    }

    public final void setBirth(LocalDate birth) {
        this.birth = birth;
    }
}
