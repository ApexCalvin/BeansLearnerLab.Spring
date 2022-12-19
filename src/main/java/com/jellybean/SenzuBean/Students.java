package com.jellybean.SenzuBean;

import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

public class Students extends People<Student>{

    public Students() { super(); };

    public Students(ArrayList<Student> studentList) { super(studentList); }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }
}
