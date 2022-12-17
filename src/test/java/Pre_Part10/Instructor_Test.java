package Pre_Part10;

import com.jellybean.SenzuBean.Instructor;
import com.jellybean.SenzuBean.People;
import com.jellybean.SenzuBean.Student;
import com.jellybean.SenzuBean.Students;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Instructor_Test {

    @Test
    public void learnTest() {
        Instructor MrTran = new Instructor(234L, "MrTran");
        Student Calvin = new Student(123L, "Calvin");
        MrTran.teach(Calvin, 10.50);
        Double expected = 10.50;
        Double actual = Calvin.getTotalStudyTime();
        assertEquals(expected, actual);
    }

    @Test
    public void lectureTest() {
        Instructor MrTran = new Instructor(234L, "MrTran");
        Student Calvin = new Student(123L, "Calvin");
        Student Lelouch = new Student(234L, "Lelouch");


//        Students students = new Students();
//        Students.add(Calvin);
//        Students.add(Lelouch);
//
//        MrTran.lecture(Students, 10.00);

        Double expected = 5.00;
        Double actual = Calvin.getTotalStudyTime();
        assertEquals(expected, actual);
    }
}
