package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void instanceTest() {
        Student Jack = new Student(1000L, "Jack");
        Student Jill = new Student(1001L, "Jill");
        Student Hill = new Student(1002L, "Hill");
        Student Humpty = new Student(1003L, "Humpty");
        Student Dumty = new Student(1004L, "Dumty");
        Students list = Students.getInstance();
        list.add(Jack);
        list.add(Jill);
        list.add(Hill);
        list.add(Humpty);
        list.add(Dumty);
        Integer expected = 5;
        Integer actual = list.getCount();
        Assert.assertEquals(expected, actual);
    }
}
