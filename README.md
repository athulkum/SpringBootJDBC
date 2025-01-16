This project showcases how to set up a Spring Boot application that connects to a database using JDBC (Java Database Connectivity). 
It includes examples of creating controllers, services, and DAOs to perform database operations such as retrieving, inserting, updating, and deleting records.

Key Features:
Spring Boot setup with JDBC integration
Basic CRUD operations using Spring Boot
Simple and clean project structure
Directory Structure
Here’s the structure of the project:

bash
Copy
athulkum-springbootjdbc.git/
└── SpringBootJDBC/
    ├── HELP.md                # Project help documentation
    ├── mvnw                   # Unix wrapper script for Maven
    ├── mvnw.cmd               # Windows wrapper script for Maven
    ├── pom.xml                # Maven project configuration
    ├── src/
    │   ├── main/
    │   │   ├── java/          
    │   │   │   └── com/
    │   │   │       └── codewithathul/
    │   │   │           ├── Controller.java        # Main controller handling requests
    │   │   │           ├── Dao.java               # Data Access Object for JDBC operations
    │   │   │           ├── IPLTeams.java          # Entity representing IPL team data
    │   │   │           ├── Service.java            # Service layer for business logic
    │   │   │           └── SpringBootJdbcApplication.java  # Main Spring Boot application
    │   │   └── resources/
    │   │       └── application.properties           # Configuration for the Spring Boot app
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── codewithathul/
    │                   └── SpringBootJdbcApplicationTests.java  # Unit tests
    └── target/
        ├── classes/           # Compiled classes and resources
        ├── test-classes/      # Compiled test classes
