package com.company;
import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this.value = value;
    }
    //Methods equals, hashCode, and toString
    @Override
    public abstract boolean equals(Object o);
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return this.value;
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
