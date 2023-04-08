package com.ekene.learnspringframework.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};
@Configuration
public class HelloSpringConfiguration {

    @Bean
    public String name(){
        return "John";
    }
    @Bean
    public int age(){
        return 19;
    }
    @Bean
    public Person person1(){
        return new Person("ben", 11);
    }
    @Bean
    @Primary
    public Person personMethodCall(){
        return new Person(name(), age());
    }
}
