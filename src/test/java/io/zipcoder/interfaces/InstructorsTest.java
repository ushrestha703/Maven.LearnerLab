package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void instanceTest() {

        Instructor Tom = new Instructor(1001);
        Instructor Jerry = new Instructor(1002);
        Instructor Joseph = new Instructor(1003);
        Instructors list = Instructors.getInstance();
        list.add(Tom);
        list.add(Jerry);
        list.add(Joseph);
        Integer expected = 3;
        Integer actual = list.getCount();
        Assert.assertEquals(expected, actual);
    }
}
