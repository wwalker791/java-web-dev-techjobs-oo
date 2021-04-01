package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    public Job test_jobA;
    public Job test_jobB;
    public Job test_jobC;
    public Job test_jobG;

    @Before
    public void createJob() {
         test_jobA = new Job("Junior Data Analyst", new Employer("Lockerdome"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("Statistical Analysis"));
         test_jobB = new Job("Project Coordinator Support", new Employer("Maritz"), new Location ("Saint Louis"), new PositionType("Technical Assistant / User Support"), new CoreCompetency("Non-coding" ));
         test_jobG = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }


    @Test
    public void testSettingJobId() {
        assertEquals(1, test_jobA.getId());
        assertEquals(test_jobA.getId() + 1, test_jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Employer acme = new Employer("ACME");
        Location desert = new Location("Desert");
        PositionType quality_control = new PositionType("Quality control");
        CoreCompetency persistence = new CoreCompetency("Persistence");

        test_jobC = new Job("Product tester", acme , desert, quality_control, persistence);
        assertTrue(test_jobC instanceof Job);
        assertEquals(test_jobC.getName(), "Product tester");
        assertEquals(test_jobC.getEmployer(), acme);
        assertEquals(test_jobC.getLocation(), desert);
        assertEquals(test_jobC.getPositionType(), quality_control);
        assertEquals(test_jobC.getCoreCompetency(), persistence);
    }

    @Test
    public void testJobsForEquality() {
        Job test_jobD = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web-Front End"), new CoreCompetency("Ruby"));
        Job test_jobE = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web-Front End"), new CoreCompetency("Ruby"));
        assertNotEquals(test_jobD, test_jobE);
    }

    @Test
    public void testToStringBlankLine() {
        String output =
               "\n" +  "ID: " + test_jobA.getId() + "\n" +
                       "Name: " + "Junior Data Analyst" + "\n" +
                       "Employer: " + "Lockerdome" + "\n" +
                       "Location: " + "Saint Louis" + "\n" +
                       "Position type: " + "Data Scientist / Business Intelligence" + "\n" +
                       "Core competency: " + "Statistical Analysis" + "\n";
        assertEquals(output, test_jobA.toString());
    }

    @Test
    public void testToStringLabel() {
        String output =
                "\n" + "ID: " + test_jobA.getId() + "\n" +
                       "Name: " + test_jobA.getName() + "\n" +
                       "Employer: " + test_jobA.getEmployer() + "\n" +
                       "Location: " + test_jobA.getLocation() + "\n" +
                       "Position type: " + test_jobA.getPositionType() + "\n" +
                       "Core competency: " + test_jobA.getCoreCompetency() + "\n";
        assertEquals(output, test_jobA.toString());
    }

    @Test
    public void testJobsToString() {
        String output = "\n" +
                "ID: " + test_jobG.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position type: " + "Data not available" + "\n" +
                "Core competency: " + "Data not available" +"\n";
        assertEquals(output, test_jobG.toString());
    }

}
