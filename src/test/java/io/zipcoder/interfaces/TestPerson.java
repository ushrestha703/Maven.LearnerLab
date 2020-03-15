package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest() {
        Person person = new Person(982L, "John");
        Long expectedId = 982L;
        Long actualId = person.getId();
        String expectedName = "John";
        String actualName = person.getName();
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void setNameTest(){
        Person personOne = new Person(982L, "John");
        personOne.setName("Wick");
        String expectedName = "Wick";
        String actualName = personOne.getName();
        Assert.assertEquals(expectedName,actualName);
    }

}
