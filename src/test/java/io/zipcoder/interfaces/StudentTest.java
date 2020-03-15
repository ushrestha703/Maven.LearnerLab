package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void implementationTest(){
        Student student = new Student(1234L, "Gunky");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        Student student = new Student(1234L, "Gunky");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        Student student = new Student(1234L, "Gunky");
        student.learn(7);
        double actualStudy = student.getTotalStudyTime();
        double expectedStudy = 7;
        Assert.assertEquals(expectedStudy, actualStudy, 0);
    }
}
