package com.company;

import java.util.Objects;
//automatically assign each new object a unique ID number.
public class Employer {
    private static int nextId = 1; //declares the variable nextId. Since it is static, its changing value is NOT stored within any Employer Object.
    private final int id;
    private String value;
    //The first constructor accepts no arguments and assigns the value of nextId to the id field. It then increments nextId. Thus, every new Employer object will get a different ID number.
    public Employer() {
        id = nextId;
        nextId++;
    }
    //The second constructor assigns aValue to the value field. However, it ALSO initializes id for the object by calling the first constructor with the this(); statement. Including this(); in any Employer constructor makes initializing id a default behavior.
    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode Methods:
    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:
    public int getId() { return this.id; }

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }

}
