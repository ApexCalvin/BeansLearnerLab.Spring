package com.jellybean.SenzuBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this annotation tells spring to scan for @Bean definitions within the scope of the class,
// and register them to the IOC Container for Inject and Autowire use later.
@Configuration //passes without this
public class StudentConfig {
/*
    Note: The creation of this class will demonstrate an implementation of bean registration in Spring.
    The class should define a method named currentStudents() which returns a Students representative of the current cohort of students.
    the method should be annotated with @Bean(name = "students")
    this ensures the Spring container registers the bean with the respective name.
    a @Bean whose name attribute is not specified defaults to the name of the method it is annotating.
    The class should define a bean named previousStudents() which returns a Students representative of the previous cohort of students.
*/
    @Bean(name = "students") //passes without this
    public Students currentStudents() {
        Students currentCohort = new Students();
        currentCohort.add(new Student(1L, "Lelouch"));
        currentCohort.add(new Student(2L, "Suzaku"));
        currentCohort.add(new Student(3L, "Kallen"));
        return currentCohort;
    }

    @Bean
    public Students previousStudents() {
        Students previousCohort = new Students();
        previousCohort.add(new Student(1L, "Naruto"));
        previousCohort.add(new Student(2L, "Sasuke"));
        previousCohort.add(new Student(3L, "Sakura"));
        return previousCohort;
    }
}

/*
    @Autowired
    injects bean by type
    can be used alone.
    If is used alone, it will be wired by type
    If more than one bean of same type are declared in the container @Autowired does not know which beans to use for injection.

    @Qualifier
    injects bean by specified name
    supports fields, setter, constructors and multi-argument methods injection
    together with @Autowired, clarifies which beans to be wired by specifying the bean name (wired by name)
 */
