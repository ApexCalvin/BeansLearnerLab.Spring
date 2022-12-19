package Pre_Part10;

import com.jellybean.SenzuBean.Instructor;
import com.jellybean.SenzuBean.Student;
import com.jellybean.SenzuBean.Students;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class Instructor_Test {

    @Test
    public void extendsPerson_Test() {
        Instructor instructor = new Instructor(1L, "calvin");
        instructor.setName("alex");
        String expected = "alex";
        String actual = instructor.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void teachTest() {
        Instructor instructor = new Instructor(1L, "calvin");
        Student student = new Student(2L, "alex");

        instructor.teach(student, 4.50);
        Double expected = 4.50;
        Double actual = student.getTotalStudyTime();
        assertEquals(expected, actual);
    }

    @Test
    public void arrList_lectureTest() {
        Instructor instructor = new Instructor(1L, "");
        Student calvin = new Student(2L, "");
        Student alex = new Student(3L, "");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(calvin);
        studentList.add(alex);

        instructor.lecture(studentList, 10.00);

        Double expected = 5.00;
        Double actual = calvin.getTotalStudyTime();
        assertEquals(expected, actual);
    }

    @Test
    public void studentsObj_lectureTest() {
        Instructor instructor = new Instructor(123L, "");

        Student Calvin = new Student(1L, "Calvin");
        Student Lelouch = new Student(2L, "Lelouch");
        Student Suzaku = new Student(3L, "Suzaku");
        Student Kallen = new Student(4L, "Kallen");

        Students studentList = new Students();
        studentList.add(Calvin);
        studentList.add(Lelouch);
        studentList.add(Suzaku);
        studentList.add(Kallen);
        System.out.println("[from test] size: "+studentList.size());
        // Students list obj can't be transfer into "lecture" method as iterable
        instructor.lecture(studentList, 20.00);

        Double expected = 5.00;
        Double actual = Calvin.getTotalStudyTime();
        assertEquals(expected, actual);
    }

}
