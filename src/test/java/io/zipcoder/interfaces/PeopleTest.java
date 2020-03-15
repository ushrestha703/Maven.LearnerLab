package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd() {
        Student testPerson = new Student(1234L, "Odie");
        Integer expected = 1;
        People<Student> testArray = new People<Student>();
        testArray.add(testPerson);
        Assert.assertEquals(expected, testArray.getCount());
    }

    @Test
    public void testRemove() {
        Person testPerson1 = new Person(1234L, "Odie");
        Person testPerson2 = new Person(5678L, "Oakley");
        Integer before = 2;
        Integer after = 1;
        People testArray = new People();
        testArray.add(testPerson1);
        testArray.add(testPerson2);
        Assert.assertEquals(before, testArray.getCount());
        testArray.removeByPerson(testPerson1);
        Assert.assertEquals(after, testArray.getCount());
    }

    @Test
    public void testFindById() {
        long id = 1234L;
        Person testPerson1 = new Person(id);
        Person expected = testPerson1;
        People testArray = new People();
        testArray.add(testPerson1);
        Person actual = testArray.findById(id);
        Assert.assertEquals(expected, actual);
    }
}
