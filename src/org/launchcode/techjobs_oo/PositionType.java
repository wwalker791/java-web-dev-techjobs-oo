package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.Tests.JobField;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType() {
        id = nextId;
        nextId++;
    }
    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    public PositionType(String value) {
        this();
        this.value = value;
    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    // Getters and Setters:

}
