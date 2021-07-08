package com.company;

import java.util.Objects;
//automatically assign each new object a unique ID number.
public class Employer extends JobField{
    public Employer(){
        super();
    }
    public Employer(String value){
        super(value);
    }
    // Custom toString, equals, and hashCode Methods: toString and hashCode were moved to JobField Class
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }
//    // Getters and Setters:
//    public int getId() {return this.id;}
//    public String getValue() {return this.value;}
//    public void setValue(String value) {this.value = value;}
}
