package Pre_Part10;

import com.jellybean.SenzuBean.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Student_Test {

    @Test
    public void learnTest() {
        Student Calvin = new Student(123L, "Calvin");
        Calvin.learn(10.50);
        Double expected = 10.50;
        Double actual = Calvin.getTotalStudyTime();
        assertEquals(expected, actual);
    }

}
