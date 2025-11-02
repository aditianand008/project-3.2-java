# Spring-Hibernate Banking System

## Objective
To create a banking system using Spring integrated with Hibernate that allows users to transfer money between accounts while ensuring transaction consistency.

## Project Structure
This module demonstrates:
- Spring and Hibernate integration
- Transaction management using Spring's `@Transactional` annotation
- Declarative transaction management
- Money transfer operations with ACID properties
- Account entity management
- Banking service implementation

## Technologies
- Spring Framework
- Hibernate ORM
- MySQL Database
- Java
- Maven

## Setup Instructions
1. Configure database connection in Spring configuration
2. Create Account entity with proper Hibernate annotations
3. Implement AccountService with transactional methods
4. Test money transfer with transaction rollback scenarios
5. Ensure proper exception handling for transaction consistency
