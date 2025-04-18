# Movie Booking Application

This project is a Spring Boot application for a movie booking system. It allows users to manage movie bookings, including creating, updating, and deleting movie entries and user accounts.

## Features

- **User Management**: Create, read, update, and delete user accounts.
- **Movie Management**: Create, read, update, and delete movie entries.
- **Ticket Management**: Manage ticket bookings for movies.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Data MongoDB
- Lombok
- Maven

## Project Structure

```
project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── moviebookingapp
│   │   │           └── project
│   │   │               ├── controller
│   │   │               │   ├── MovieController.java
│   │   │               │   └── UserController.java
│   │   │               ├── entity
│   │   │               │   ├── Movie.java
│   │   │               │   ├── Ticket.java
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   ├── MovieRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               └── service
│   │   │                   ├── MovieService.java
│   │   │                   └── UserService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── moviebookingapp
│                   └── project
│                       └── ProjectApplicationTests.java
├── .gitignore
├── .gitattributes
├── .vscode
│   ├── launch.json
│   └── settings.json
├── Dockerfile
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using Maven:
   ```
   ./mvnw spring-boot:run
   ```
4. Access the application at `http://localhost:8080`.

## API Endpoints

### User Endpoints

- `POST /api/users`: Create a new user.
- `GET /api/users/{id}`: Retrieve a user by ID.
- `GET /api/users`: Retrieve all users.
- `PUT /api/users/{id}`: Update a user by ID.
- `DELETE /api/users/{id}`: Delete a user by ID.

### Movie Endpoints

- `POST /api/movies`: Create a new movie.
- `GET /api/movies/{id}`: Retrieve a movie by ID.
- `GET /api/movies`: Retrieve all movies.
- `PUT /api/movies/{id}`: Update a movie by ID.
- `DELETE /api/movies/{id}`: Delete a movie by ID.

## License

This project is licensed under the MIT License.