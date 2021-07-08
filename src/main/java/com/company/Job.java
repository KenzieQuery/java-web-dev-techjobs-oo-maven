package com.company;
import java.util.Objects;

public class Job {
    private static int nextId = 1;
    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field
    //Initialize Unique ID
    public Job() {
        id = nextId;
        nextId++;
    }
    //Initialize the id and value fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.
    @Override
    //because this Job class does not extend JobField all three methods are present (equals, hashCode, and toString).
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        //if all fields are blank then return "OOPS! This job does not seem to exist."
        if (this.name.equals("") && this.employer.getValue().equals("") && this.location.getValue().equals("") && this.positionType.getValue().equals("") && this.coreCompetency.getValue().equals("")) {
            return "OOPS! This job does not seem to exist.";
        }

        //Sets new value for fields to be "Data not available" when field is blank.
        String nameValue = this.name;
        String employerValue = this.getEmployer().toString();
        String locationValue = this.getLocation().toString();
        String positionTypeValue = this.getPositionType().toString();
        String coreCompetencyValue = this.getCoreCompetency().toString();
        if (this.name.equals("")) {
            nameValue = "Data not available";
        }
        if (this.employer.getValue().equals("")) {
            employerValue = "Data not available";
        }
        if (this.location.getValue().equals("")) {
            locationValue = "Data not available";
        }
        if (this.positionType.getValue().equals("")) {
            positionTypeValue = "Data not available";
        }
        if (this.coreCompetency.getValue().equals("")) {
            coreCompetencyValue = "Data not available";
        }
        //new return for when field is blank. value is replaced with new value declaring "Data not available".
        return "\nID: " + this.id+ "\nName: " + nameValue + "\nEmployer: " + employerValue + "\nLocation: " + locationValue + "\nPosition Type: " + positionTypeValue + "\nCore Competency: " + coreCompetencyValue + "\n";
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public Employer getEmployer() {
        return employer;
    }
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
    public Location getLocation() {
        return location;
    }
//    public void setLocation(Location location) {
//        this.location = location;
//    }
    public PositionType getPositionType() {
        return positionType;
    }
//    public void setPositionType(PositionType positionType) {
//        this.positionType = positionType;
//    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
//    public void setCoreCompetency(CoreCompetency coreCompetency) {
//        this.coreCompetency = coreCompetency;
//    }
}
