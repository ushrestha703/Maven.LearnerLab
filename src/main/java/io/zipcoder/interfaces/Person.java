package io.zipcoder.interfaces;

public class Person {
    final Long id;
    private String name;

    public Person(long id) { this.id = id; }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}