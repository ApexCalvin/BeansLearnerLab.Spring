package com.jellybean.SenzuBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() { //TECH CONNECT USA
        return null;
    }

    @Bean
    public Instructors tcUkInstructors() { // TECH CONNECT UK
        return null;
    }

    //@Bean(name = "instructors") - Don't need to name Bean bc it uses primary
    @Bean
    @Primary
    public Instructors zcwInstructors() {
        return null;
    }

}


