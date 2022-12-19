package Pre_Part10;

import com.jellybean.SenzuBean.Person;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class Person_Test {

    @Test
    public void getName_Test() {
        Person calvin = new Person(1L, "calvin");
        String expected = "calvin";
        String actual = calvin.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getID_Test() {
        Person calvin = new Person(1L, "calvin");
        Long expected = 1L;
        Long actual = calvin.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void setName_Test() {
        Person calvin = new Person(1L, "calvin");
        calvin.setName("alex");
        String expected = "alex";
        String actual = calvin.getName();
        assertEquals(expected, actual);
    }
}
