# Student Management System (Spring Boot)

A simple backend REST API built using Java Spring Boot to manage student records.

# Features:
- Register new students
- View all students
- Edit or delete existing records
- Basic Spring Security (username/password auth)

# Technologies:
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Spring Security

# Running the Project:
1. Clone the project
2. Create a MySQL database named `studentdb`
3. Update your `application.properties` with your DB credentials
4. Run using your IDE or:  
   `mvn spring-boot:run`

Test the API using Postman:
- `GET /students`
- `POST /students`
- `PUT /students/{id}`
- `DELETE /students/{id}`
- `GET /students/search?name=John`
