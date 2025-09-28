# Spring Boot JWT Authentication Project

This is a Spring Boot application that implements JWT (JSON Web Token) based authentication with H2 in-memory database.

## Features

- JWT based authentication
- User registration and login
- Role-based authorization
- H2 in-memory database
- RESTful API endpoints

## Technical Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- JSON Web Token (JWT)

## Configuration

The application runs on port 8081 and uses the following configurations:

- H2 Database Console: http://localhost:8081/h2-console
- Database URL: jdbc:h2:mem:jwt_db
- Username: sa
- Password: (empty)

## API Endpoints

### Authentication Endpoints

```
POST /api/v1/auth/signup
- Register a new user
- Request body: { "username": "user", "password": "password" }

POST /api/v1/auth/signin
- Authenticate user and get JWT token
- Request body: { "username": "user", "password": "password" }
```

### Protected Endpoints

```
GET /api/v1/welcome
- Public endpoint accessible without authentication

GET /api/v1/user
- Protected endpoint, requires valid JWT token

GET /api/v1/special
- Protected endpoint, requires valid JWT token

DELETE /api/v1/user/{id}
- Delete user by ID
- Protected endpoint, requires valid JWT token
```

## Security

- JWT expiration time: 1 hour
- Passwords are encoded using BCrypt
- Token must be included in Authorization header as "Bearer {token}"

## Getting Started

1. Clone the repository
2. Navigate to the project directory
3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```
4. The application will start on http://localhost:8081

## Database

The application uses H2 in-memory database with the following configuration:
- Database is automatically created when the application starts
- JPA automatically creates tables based on entity classes
- Data is lost when the application stops (in-memory database)
- Access H2 console at http://localhost:8081/h2-console

## Error Handling

- Duplicate username registration is prevented
- Invalid credentials return appropriate error messages
- Invalid/expired tokens are rejected

## Note

This is a secure implementation with JWT authentication. Make sure to:
- Keep the JWT secret key secure
- Use HTTPS in production
- Change default H2 database credentials in production
- Adjust token expiration time as needed
