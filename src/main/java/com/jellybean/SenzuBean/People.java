package com.jellybean.SenzuBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class People<T extends Person> implements Iterable<T>{

    ArrayList<T> personList = new ArrayList<>();

    public People() {};

    public People(ArrayList<T> personList) { this.personList = personList; }

    public void add(T person) {
        personList.add(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    };

    public void addAll(Iterable<T> people) { // ??
        for(T person : people) {
            add(person);
        }
    }

    public T findById(Long id) {
        for(T person : personList) {
            if(Objects.equals(person.id, id)) {
                return person;
            }
        }
        return null;
    }

    public List<T> findAll() { //GET PERSON LIST?!
        return personList;
    }
}
