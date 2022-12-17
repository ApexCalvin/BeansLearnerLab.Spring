package com.jellybean.SenzuBean;

import java.util.Collection;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double length = ((Collection<?>) learners).size();
        double numberOfHoursPerLearner = numberOfHours / length;
        for(Learner l : learners) l.learn(numberOfHoursPerLearner);
    }
}
