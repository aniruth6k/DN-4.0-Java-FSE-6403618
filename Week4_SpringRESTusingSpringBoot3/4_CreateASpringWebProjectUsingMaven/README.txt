spring-learn is a modular Spring Boot web project using Maven.

- Entry point: com.cognizant.spring_learn.SpringLearnApplication
  - Uses @SpringBootApplication for configuration and scanning
  - Logs startup messages

- src/main/java: Application source code
- src/main/resources: Configuration
- src/test/java: Unit tests

Build:
    mvn clean package

Run:
    mvn spring-boot:run
