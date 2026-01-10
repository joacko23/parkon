# ParkOn

ParkOn es un proyecto de portfolio diseñado para demostrar arquitectura de microservicios en Java, aplicando buenas prácticas de diseño, escalabilidad y resiliencia.

## 🎯 Objetivo

Demostrar conocimientos en:

- Microservicios con Spring Boot
- Arquitectura Hexagonal
- Spring Cloud (Config Server, Eureka, Gateway)
- Seguridad con JWT
- Comunicación síncrona y asíncrona
- Saga pattern
- Resiliencia y escalado

## 🧱 Arquitectura General

- API Gateway como punto de entrada
- Service Discovery (Eureka)
- Config Server centralizado
- Microservicios independientes con base de datos propia
- Comunicación async mediante eventos
- Arquitectura Hexagonal en cada servicio

## 🔧 Tecnologías

- Java 17
- Spring Boot
- Spring Cloud
- Spring Security + JWT
- Resilience4j
- RabbitMQ / Kafka (eventos)
- MySQL / PostgreSQL
- Docker & Docker Compose

## 📦 Microservicios

- **Auth Service**: autenticación, JWT, roles
- **User Service**: usuarios, patentes, saldo, transferencias
- **Parking Service**: gestión de estacionamientos
- **Payment Service**: pagos y saga con parking

## 🚀 Estado del proyecto

En desarrollo – fase inicial de infraestructura.
