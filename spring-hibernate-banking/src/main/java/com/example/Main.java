package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring-Hibernate application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // TODO: Get AccountService and perform money transfer operations
        // TODO: Demonstrate transaction management (commit/rollback)
        
        System.out.println("Spring-Hibernate Banking System initialized successfully!");
    }
}
