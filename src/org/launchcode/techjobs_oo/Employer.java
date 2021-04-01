package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.Tests.JobField;

import java.util.Objects;

public class Employer extends JobField {

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:


    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

}
