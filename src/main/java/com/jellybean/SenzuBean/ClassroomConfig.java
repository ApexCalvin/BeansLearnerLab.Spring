package com.jellybean.SenzuBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean
    public Classroom currentCohort(Instructors instructors, Students students) {
        return null;
    }

    @Bean
    public Classroom previousCohort() {
        // Dependencies: instructors, previousStudents;
        return null;
    }

    // @DependsOn({ "instructors", "students"} ) -- ????
}
