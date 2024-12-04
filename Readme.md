# Security API with JWT and Spring Security

## Overview

This project is a Spring Boot application that secures APIs using JSON Web Tokens (JWT) and Spring Security. It provides a robust authentication and authorization mechanism for managing user access to various resources.


## Technologies Used

- Java 17
- Spring Boot 3.3.4
- Spring Security
- PostgreSQL
- JJWT for JWT handling
- Lombok for reducing boilerplate code
- Maven for dependency management

## Getting Started

### Prerequisites

- Java 17
- Maven
- PostgreSQL

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/security-api.git
   cd security-api
   ```

2. Create a PostgreSQL database:

   ```sql
   CREATE DATABASE runnerz;
   ```

3. Update the `application.yml` file with your database credentials:

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/runnerz
       username: your_username
       password: your_password
   ```

4. Build the project:

   ```bash
   ./mvnw clean install
   ```

5. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

### API Documentation

The API documentation is available at:

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI Docs: `http://localhost:8080/v3/api-docs`

### Usage

- **Register a new user**: POST `/api/v1/auth/register`
- **Authenticate a user**: POST `/api/v1/auth/login`
- **Access secured resources**: Use the JWT token received upon authentication in the `Authorization` header as `Bearer <token>`.

