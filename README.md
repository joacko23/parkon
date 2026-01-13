<!-- 🅿️ ParkOn - Microservices Backend Project -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:3A0CA3,100:7209B7&height=120&section=header&text=ParkOn&fontSize=35&fontColor=fff&animation=fadeIn" />
</p>

<p align="center">
  <b>Backend Microservices System · Java · Spring Boot · Hexagonal Architecture</b><br>
  <i>Portfolio project focused on scalable, secure and resilient backend design</i>
</p>

---

## 🧠 About the Project

**ParkOn** is a backend-first portfolio project created to demonstrate the design and implementation of a **distributed microservices architecture** using **Java and Spring Boot**.

The project simulates a **multi-municipality smart parking system**, focusing on **clean architecture**, **service autonomy**, and **scalability**, rather than UI features.

> 🚧 This project is under active development and evolves as new architectural concepts are incorporated.

---

## 🎯 Technical Goals

This project is designed to demonstrate knowledge and practical application of:

- Microservices architecture with Spring Boot
- Hexagonal Architecture (Ports & Adapters)
- Spring Cloud ecosystem
  - Config Server
  - Eureka (Service Discovery)
  - API Gateway
- JWT-based authentication and authorization
- Synchronous and asynchronous inter-service communication
- Saga Pattern for distributed transactions
- Resilience, fault tolerance and scalability

---

## 🧱 High-Level Architecture

- API Gateway as the single entry point
- Centralized configuration with Config Server
- Service Discovery using Eureka
- Independent microservices, each with its own database
- Asynchronous communication through events
- Hexagonal Architecture applied within each service

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Cloud
- Spring Security + JWT
- Resilience4j
- RabbitMQ / Kafka (event-driven communication)
- MySQL / PostgreSQL
- Docker & Docker Compose

---

## 📦 Microservices Overview

- **Auth Service**
  - Authentication and authorization
  - JWT generation and validation
  - Role-based access control

- **User Service**
  - User management
  - Vehicle plates
  - Balance and transfers between users

- **Parking Service**
  - Parking session management
  - Time tracking and cost calculation

- **Payment Service**
  - Payment processing
  - Distributed transaction management using Saga pattern

---

## 🚀 Project Status

🟡 **In development** — initial infrastructure and service foundations are currently being implemented.

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:7209B7,100:3A0CA3&height=120&section=footer" />
</p>
