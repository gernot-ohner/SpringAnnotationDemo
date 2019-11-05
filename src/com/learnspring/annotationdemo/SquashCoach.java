package com.learnspring.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your lunges";
    }
}
