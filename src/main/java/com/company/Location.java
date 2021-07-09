package com.company;

import java.util.Objects;

public class Location extends JobField{
    public Location(){
        super();
    }
    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The constructors should also call the empty constructor in order to initialize the 'id' field.
    public Location(String aValue){
        super(aValue);
    }
    // Custom toString, equals, and hashCode Methods: toString and hashCode were moved to JobField Class

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return this.getId() == location.getId();
//    }

    // Getters and Setters:
//    public int getId() { return this.id; }
//    public String getValue() { return this.value; }
//    public void setValue(String value) { this.value = value; }
}
