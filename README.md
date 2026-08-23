# Student Management System

A web-based Student Management System built using Java and Spring Boot for managing student records through a simple web interface.

## 🚀 Features

- Add a new student
- View all students
- Search for students
- Search students by ID
- Update student information
- Delete a student
- Store and manage student records in MySQL
- JSP-based web interface
- MVC-based application structure

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- JSP
- HTML
- CSS
- Maven

## 🏗️ Application Architecture

The application follows a layered architecture:

```text
Client / Browser
       ↓
   Controller
       ↓
     Service
       ↓
   Repository
       ↓
     MySQL
```

### Controller

Handles HTTP requests from the web interface and connects them with the application logic.

### Service

Contains the application logic for managing student records.

### Repository

Uses Spring Data JPA to perform database operations.

### Model

Contains the `Student` entity representing student information stored in the database.

## 📁 Project Structure

```text
Student-Management-System
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.project.studentmanagementAPI
│   │   │       ├── Controller
│   │   │       ├── Service
│   │   │       ├── Repository
│   │   │       ├── model
│   │   │       ├── StudentmanagementApiApplication.java
│   │   │       └── ServletInitializer.java
│   │   │
│   │   ├── resources
│   │   │   └── application-demo.properties
│   │   │
│   │   └── webapp
│   │       └── view
│   │           ├── home.jsp
│   │           ├── studentform.jsp
│   │           ├── updateform.jsp
│   │           ├── allinfo.jsp
│   │           └── searchedfile.jsp
│   │
│   └── test
│
├── pom.xml
├── .gitignore
├── mvnw
└── mvnw.cmd
```

## 🗄️ Database

The application uses **MySQL** to store student records.

**Spring Data JPA** and **Hibernate** are used for database interaction and ORM.

The real database configuration is intentionally not included in this repository to avoid exposing database credentials.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/amitesh-code/Student-Management-System.git
```

### 2. Open the project

Open the project in IDE that supports Maven and Spring Boot.

### 3. Start MySQL

Make sure your MySQL server is running.

Create the database if it does not already exist:

```sql
CREATE DATABASE Studentdb;
```

### 4. Configure the application

Create:

```text
src/main/resources/application.properties
```

and add your own MySQL username and password.

### 5. Run the application

Run `StudentmanagementApiApplication.java` as a Spring Boot application.

### 6. Open the application

The application uses the context path:

```text
/student
```

Open the appropriate local URL in your browser after the application starts.

## 📚 What I Learned

While building this project, I practiced:

- Java application development
- Spring Boot project structure
- Spring MVC
- MVC architecture
- Dependency Injection
- Spring Data JPA
- Hibernate and ORM
- CRUD operations
- MySQL database integration
- JSP-based web development
- Maven

## 🔮 Future Improvements

- Improve validation and error handling
- Add authentication and authorization
- Add advanced search and filtering options
- Improve the user interface and responsiveness
- Add pagination and sorting
- Separate the frontend and backend using REST APIs
- Expand automated tests

## 👨‍💻 Author

**Amitesh**

GitHub: [https://github.com/amitesh-code](https://github.com/amitesh-code)

