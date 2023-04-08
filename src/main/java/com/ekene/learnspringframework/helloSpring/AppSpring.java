package com.ekene.learnspringframework.helloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppSpring {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person1"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("personMethodCall"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
