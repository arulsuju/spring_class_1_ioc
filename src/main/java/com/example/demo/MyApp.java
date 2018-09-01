package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String arg[]) {
        try {
            ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
            Coach coach=context.getBean("mycoach",Coach.class);

            System.out.println(coach.getInfo());
            context.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
