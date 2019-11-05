package com.learnspring.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach squashCoach = context.getBean("squashCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(squashCoach.getDailyWorkout());
        context.close();
    }
}
