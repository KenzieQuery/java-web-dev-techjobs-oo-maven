package com.company.incomplete;
import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTests {
    public Job job1 = new Job();
    public Job job2 = new Job();
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        Assertions.assertEquals(job1.getId() + 1, job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        //Declare and initialize a new Job object
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //Use assert statements to test that the constructor correctly assigns the class and value of each field.
        Assertions.assertEquals("Product tester", job.getName());
        Assertions.assertTrue(job.getEmployer() instanceof Employer);
        Assertions.assertEquals("ACME", job.getEmployer().toString());
        Assertions.assertTrue(job.getLocation() instanceof Location);
        Assertions.assertEquals("Desert", job.getLocation().toString());
        Assertions.assertTrue(job.getPositionType() instanceof PositionType);
        Assertions.assertEquals("Quality Control", job.getPositionType().toString());
        Assertions.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        Assertions.assertEquals("Persistence", job.getCoreCompetency().toString());
    }
    @Test
    public void testJobsForEquality() {
        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertFalse(testJob.equals(testJob2));
    }
    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    //Test 1: When passed a Job object, it should return a string that contains a blank line before and after the job information.
    //Test 2: The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
    //Test 3: If a field is empty, the method should add, “Data not available” after the label.
    @Test
    public void testToStringContainsBlankLines() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertEquals('\n', job.toString().charAt(0));
        Assertions.assertEquals('\n', job.toString().charAt(job.toString().length() - 1));
    }
    @Test
    public void testToStringHasLabelsForEachField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertEquals("\nID: " + job.getId()+ "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", job.toString());
    }
    @Test
    public void testToStringDataNotAvailable() {
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        Assertions.assertEquals("\nID: " + job.getId()+ "\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n", job.toString());
    }
    @Test
    public void testToStringIsFormattedProperly() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expectedToStringOutput =
                "\nID: " + job.getId() +
                        "\nName: Product tester\n" +
                        "Employer: ACME\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality Control\n" +
                        "Core Competency: Persistence\n";
        Assertions.assertEquals(expectedToStringOutput, job.toString());
    }
    @Test
    public void testDataNotAvailable() {
        Job job = new Job("Software Eng. 1", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedToStringOutput =
                "\nID: " + job.getId() +
                        "\nName: Software Eng. 1\n" +
                        "Employer: Data not available\n" +
                        "Location: Data not available\n" +
                        "Position Type: Data not available\n" +
                        "Core Competency: Data not available\n";
        Assertions.assertEquals(expectedToStringOutput, job.toString());
    }
}
