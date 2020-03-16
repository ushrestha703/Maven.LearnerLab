package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class People <E extends Person> {

   ArrayList<E> personList;

    public People() { personList = new ArrayList<>(); }

    public boolean add(E person) { return personList.add(person); }

    public E findById(long id) {
        for (E person: personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(E person) { return personList.contains(person);}

    public void removeByPerson(E person) { personList.remove(person); }

    public  void removeById(long id) { personList.remove(findById(id)); }

    public Integer getCount() { return personList.size(); }

    public E[] toArray() { return (E[]) personList.toArray();}

    public void removeAll() { personList.clear(); }
}