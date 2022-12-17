package Pre_Part10;

import com.jellybean.SenzuBean.Person;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class Person_Test {
    @Test
    public void constructorTest_1() {
        Person Calvin = new Person(123L, "Calvin");
        String expected = "Calvin";
        String actual = Calvin.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void constructorTest_2() {
        Person Calvin = new Person(123L, "Calvin");
        Long expected = 123L;
        Long actual = Calvin.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void constructorTest_3() {
        Person Calvin = new Person(123L, "Calvin");
        Calvin.setName("Tran");
        String expected = "Tran";
        String actual = Calvin.getName();
        assertEquals(expected, actual);
    }
}
