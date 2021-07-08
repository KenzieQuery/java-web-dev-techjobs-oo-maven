package com.company;
import java.util.Objects;
public class PositionType extends JobField{
    public PositionType() {
        super();
    }
    public PositionType(String value) {
        super(value);
    }
    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    //toString and hashCode were moved to JobField Class
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType position = (PositionType) o;
        return this.getId() == position.getId();
    }
    // Getters and Setters:
//    public int getId() { return this.id; };
//    public String getValue() { return this.value; }
//    public void setValue(String value) { this.value = value; }
}
