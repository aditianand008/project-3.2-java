package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // TODO: Get beans from context and demonstrate DI
        
        System.out.println("Spring DI Demo with Java Config initialized successfully!");
    }
}
