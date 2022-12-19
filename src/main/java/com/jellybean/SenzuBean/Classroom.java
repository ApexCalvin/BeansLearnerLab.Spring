package com.jellybean.SenzuBean;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        //The class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter
        // to host a lecture to the composite personList field in the students reference.
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
