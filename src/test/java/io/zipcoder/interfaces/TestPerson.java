package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest() {
        Person person = new Person(9823, "John");
        Long expectedId = 9823;
        Long actualId = person.getId();
        String expectedName = "John";
        String actualName = person.getName();
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void setNameTest(){
        Person personOne = new Person(9823, "John");
        personOne.setName("Wick");
        String expectedName = "Wick";
        String actualName = personOne.getName();
        Assert.assertEquals(expectedName,actualName);
    }

}
