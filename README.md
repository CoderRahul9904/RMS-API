# 🚆 Railway Management System (RMS) – Spring Boot Backend

## 📌 Overview

The Railway Management System (RMS) is a backend REST API built using **Spring Boot** that manages railway operations such as train management, passenger management, ticket booking, payments, and admin operations.
The system uses **JWT Authentication**, **PostgreSQL Database**, and **Swagger API Documentation**, and is deployed on **Render**.

---

## 🛠 Tech Stack

* **Backend:** Spring Boot
* **Database:** PostgreSQL (Neon Cloud / Local)
* **Security:** Spring Security + JWT Authentication
* **API Documentation:** Swagger (OpenAPI)
* **Build Tool:** Maven
* **Deployment:** Render
* **Version Control:** GitHub

---

## 📐 System Architecture Diagram

```
                ┌───────────────────────┐
                │        Client         │
                │  (Browser / Postman)  │
                └──────────┬────────────┘
                           │ HTTP Requests
                           ▼
                ┌───────────────────────┐
                │   Spring Boot API     │
                │ Railway Management    │
                └──────────┬────────────┘
                           │
        ┌──────────────────┼──────────────────┐
        ▼                  ▼                  ▼
 ┌─────────────┐   ┌─────────────┐   ┌─────────────┐
 │ Controllers │   │   Services  │   │ Repositories│
 └─────────────┘   └─────────────┘   └─────────────┘
                           │
                           ▼
                ┌───────────────────────┐
                │   PostgreSQL Database │
                │     (Neon / Local)    │
                └───────────────────────┘
                           │
                           ▼
                ┌───────────────────────┐
                │      Swagger UI       │
                │ API Documentation     │
                └───────────────────────┘
```

---

## 🔐 Authentication Flow (JWT)

```
User Login → Server Generates JWT Token
Client Stores Token
Client Sends Token in Authorization Header
JWT Filter Validates Token
If Valid → API Access Granted
If Invalid → Unauthorized
```

Authorization Header Format:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 📂 Project Structure

```
com.rms.api
 ├── config
 ├── controller
 ├── dto
 ├── entity
 ├── filter
 ├── repository
 ├── security
 ├── service
 ├── util
 └── resources
      ├── application.properties
      ├── application-dev.properties
      ├── application-prod.properties
      ├── schema.sql
      └── data.sql
```

---

## 📊 Database Tables

* users
* passenger
* train
* ticket
* payment
* admin

---

## 🔗 API Endpoints (Major)

| Module  | Endpoint             |
| ------- | -------------------- |
| Auth    | /auth/login          |
| Auth    | /auth/register       |
| Train   | /trains              |
| Train   | /trains/search       |
| Ticket  | /tickets/book        |
| Ticket  | /tickets/cancel/{id} |
| Payment | /payments            |
| Admin   | /admin/add-train     |
| Admin   | /admin/delete-train  |

---

## 📘 Swagger API Documentation

Swagger UI:

```
http://localhost:8009/swagger
```

Production Swagger:

```
https://your-render-url/swagger
```

---

## 🗄 Database Configuration

### Local PostgreSQL

```
spring.datasource.url=jdbc:postgresql://localhost:5432/rms
spring.datasource.username=postgres
spring.datasource.password=root
```

### Production (Neon PostgreSQL)

Environment Variables:

```
DB_URL=
DB_USERNAME=
DB_PASSWORD=
SPRING_PROFILES_ACTIVE=prod
```

---

## 🚀 Deployment (Render)

Steps:

1. Push project to GitHub
2. Create Web Service on Render
3. Add Environment Variables
4. Deploy
5. Open Swagger URL

---

## 📌 Features

* User Authentication (JWT)
* Role-Based Access (Admin/User)
* Train Management
* Passenger Management
* Ticket Booking & Cancellation
* Payment Management
* Swagger API Documentation
* PostgreSQL Database
* Cloud Deployment

---

## 👨‍💻 Author

**Rahul Mourya**
Railway Management System – Spring Boot Project

---
