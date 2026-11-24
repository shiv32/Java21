Vanilla java basic crud rest api Demo.

You can build a basic **CRUD REST API using only Core Java (Vanilla Java), 
without Spring Boot or any external framework.**

Java provides a built-in HTTP server through `com.sun.net.httpserver.HttpServer`.

Let's build a simple User Management API.

## **1. REST API endpoints**

| HTTP Method | Endpoint   | Operation      |
| ----------- | ---------- | -------------- |
| GET         | `/users`   | Get all users  |
| GET         | `/users/1` | Get user by ID |
| POST        | `/users`   | Create user    |
| PUT         | `/users/1` | Update user    |
| DELETE      | `/users/1` | Delete user    |

## **2. Architecture**

**Postman / REST Client**

**Java HTTP Server**

HttpServer

**Controller**

Handles HTTP requests

**Service**

Business logic

**Repository**

Data storage (initially HashMap)

## **3. Complete basic implementation**

For learning, start with one `Main.java` file.

Learning demonstration only: this example uses simplistic JSON parsing and in-memory storage. It is not production-ready.

## **4. Test using Postman**

**Create user**

```
POST http://localhost:8080/users
Content-Type: application/json

{"name":"John"}
```

**Get all users**

```
GET http://localhost:8080/users
```

**Get user by ID**

```
GET http://localhost:8080/users/1
```

**Update user**

```
PUT http://localhost:8080/users/1

{"name":"David"}
```

**Delete user**

```
DELETE http://localhost:8080/users/1
```

## **5. Vanilla Java vs Spring Boot**

| Feature              | Vanilla Java        | Spring Boot               |
| -------------------- | ------------------- | ------------------------- |
| HTTP server          | Built-in HttpServer | Embedded Tomcat, etc.     |
| Routing              | Manual              | Annotations               |
| CRUD                 | Manual              | Easier with Spring Data   |
| JSON                 | Need JSON library   | Jackson commonly included |
| Database             | JDBC                | Spring Data/JDBC          |
| Dependency injection | Manual              | Built-in                  |
| REST API             | Yes                 | Yes                       |

**Important:** Vanilla Java is capable of creating REST APIs. 
However, production enterprise Java development commonly uses frameworks such as Spring Boot.

## **6. My recommended learning progression**

1. Core Java + HttpServer
2. CRUD REST API
3. JDBC + PostgreSQL
4. JSON using Jackson
5. Authentication + JWT
6. Redis caching
7. Multithreading and concurrency
8. AWS deployment

You can learn the underlying Java logic first and then 
use Spring Boot to simplify HTTP handling, dependency injection, database access, and other infrastructure.

**The important distinction:** Spring Boot doesn't replace Java.
It provides infrastructure around your Java application.

