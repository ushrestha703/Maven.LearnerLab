package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    Instructor instructor = new Instructor(12345L);

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Student testStudent = new Student(1234L, "Nobody");
        double preStudyTime = testStudent.getTotalStudyTime();
        double numberOfHours = 5;
        double postStudyTime = preStudyTime + numberOfHours;
        Instructor testInstructor = new Instructor(1234L);
        testInstructor.teach(testStudent, numberOfHours);
        Assert.assertEquals(postStudyTime, testStudent.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture() {
        Student studentOne = new Student(1234L, "Jack");
        Student studentTwo = new Student(5678L ,"Jill");
        Learner[] students = {studentOne, studentTwo};
        double numberOfHours = 5;
        double numberOfHoursPerStudent = numberOfHours / students.length;
        double preStudyTime1 = studentOne.getTotalStudyTime();
        double preStudyTime2 = studentTwo.getTotalStudyTime();
        double postStudyTime1 = preStudyTime1 + (numberOfHoursPerStudent);
        double postStudyTime2 = preStudyTime1 + (numberOfHoursPerStudent);
        instructor.lecture(students, numberOfHours);
        Assert.assertEquals(postStudyTime1, studentOne.getTotalStudyTime(), .001);
        Assert.assertEquals(postStudyTime2, studentTwo.getTotalStudyTime(), .001);
    }

}
