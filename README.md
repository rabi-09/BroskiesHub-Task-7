# 📚 BroskiesHub Java Internship - Task 7

This is a simple **Task Management REST API** built using **Spring Boot**. It supports basic **CRUD operations** on tasks and enables **JSON-based communication** with clients.

---

## 📝 Task Description

Develop a RESTful API to manage tasks using **Spring Boot**, **Spring Data JPA**, and **Java**. This API performs:

  - ✅ Create a new task
  - 📋 Retrieve all tasks
  - 🔍 Retrieve a task by ID
  - 🔁 Update an existing task
  - ❌ Delete a task by ID

This project demonstrates concepts of **RESTful APIs**, **Spring annotations**, **JPA repository usage**, and **JSON request/response handling**.

---

## 🎯 Objective

To understand and implement:
  - **Spring Boot** for creating REST APIs
  - **Spring Data JPA** for database operations
  - **CRUD functionality** with a simple data model
  - **Request mapping** using `@RestController`, `@PostMapping`, etc.
  - **Testing using Postman or similar tools**
  - **JSON data exchange between client and server**

---

## 🧠 Concepts Covered

  - Spring Boot fundamentals
  - REST API design with Spring
  - CRUD operations using Spring Data JPA
  - Entity creation using JPA annotations
  - Exception handling (basic)
  - HTTP methods: GET, POST, PUT, DELETE

---

## 🔧 CRUD Endpoints

| Method | Endpoint                | Description       |
| ------ | ----------------------- | ----------------- |
| POST   | `/api/task/create`      | Create a new task |
| GET    | `/api/task/get-all`     | Get all tasks     |
| GET    | `/api/task/get/{id}`    | Get task by ID    |
| PUT    | `/api/task/update/{id}` | Update task by ID |
| DELETE | `/api/task/delete/{id}` | Delete task by ID |

---

## ⚙️ Technologies Used

  - Java
  - Spring Boot
  - Spring Web
  - Spring Data JPA
  - Hibernate (JPA Provider)
  - JSON (Jackson)
  - MySQL (or any DB of your choice)
  - Postman (for testing)
  - IDE: IntelliJ / VS Code

---

## 📦 Project Structure
```plaintext
  com.rabi.TaskAPI
  │
  ├── controller
  │ └── TaskController.java
  │
  ├── entity
  │ └── Task.java
  │
  ├── repo
  │ └── TaskRepo.java
  │
  ├── service
  │ └── TaskService.java
  │
  └── TaskApiApplication.java
```

---

## 🚀 Project Setup

### Prerequisites
- Java 21
- MySQL installed & running
- Maven 
- Postman (optional for API testing)

### Clone the Repository
```bash
  git clone https://github.com/rabi-09/BroskiesHub-Task-7.git
  cd BroskiesHub-Task-7
```

### Setup Database
- Create a MySQL database 
- Update your application.properties file

### Build & Run
```bash
  mvn clean install
  mvn spring-boot:run
```
---
