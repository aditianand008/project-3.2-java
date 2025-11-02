package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        
        // TODO: Implement CRUD operations for Student entity
        
        System.out.println("Hibernate Student CRUD application initialized!");
        
        factory.close();
    }
}
