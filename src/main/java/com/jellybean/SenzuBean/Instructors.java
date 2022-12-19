package com.jellybean.SenzuBean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {

    public Instructors() { super(); };

    public Instructors(ArrayList<Instructor> instructorList) { super(instructorList); }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }
}
