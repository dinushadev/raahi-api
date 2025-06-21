# RAAHI Spring Boot REST API

RAAHI is a Spring Boot REST API service using PostgreSQL and an expert decuple (10-layer) architecture. It provides a sample CRUD REST API for the `SaffariPackage` entity, following best practices for DDD, clean code, and layered architecture.

## Features
- Expert decuple (10-layer) architecture
- Domain-Driven Design (DDD)
- PostgreSQL integration
- Sample CRUD API for SaffariPackage
- Clean code and separation of concerns

## Architecture Overview
The project is organized into the following layers:
1. **Presentation**: REST controllers (API endpoints)
2. **Application**: Application services (use cases)
3. **Domain**: Domain models/entities
4. **DTO**: Data Transfer Objects
5. **Repository**: Data access interfaces
6. **Infrastructure**: Data access implementations
7. **Service**: Business logic services
8. **Mapper**: Entity/DTO mappers
9. **Assembler**: Assembler classes for complex object creation
10. **Exception**: Custom exception handling

## Getting Started
### Prerequisites
- Java 17 or later
- Maven
- PostgreSQL

### Database Setup
1. Start your PostgreSQL server.
2. Create a database named `saffari_db`:
   ```sh
   psql -U postgres -c "CREATE DATABASE saffari_db;"
   ```
3. (Optional) Update the username and password in `src/main/resources/application.properties` if different from default.

### Configuration
Edit `src/main/resources/application.properties` as needed:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/saffari_db
spring.datasource.username=postgres
spring.datasource.password=postgres
```

### Build and Run
To build and run the service:
```sh
./mvnw clean install
./mvnw spring-boot:run
```

### API Endpoints
- `POST   /api/saffari-packages`   - Create a new SaffariPackage
- `GET    /api/saffari-packages`   - List all SaffariPackages
- `GET    /api/saffari-packages/{id}` - Get a SaffariPackage by ID
- `PUT    /api/saffari-packages/{id}` - Update a SaffariPackage
- `DELETE /api/saffari-packages/{id}` - Delete a SaffariPackage

### Example Request (Create)
```sh
curl -X POST http://localhost:8080/api/saffari-packages \
  -H 'Content-Type: application/json' \
  -d '{"name":"Jungle Adventure","description":"A wild jungle tour","price":199.99}'
```

## Project Structure
- `presentation/`   - REST controllers
- `application/`    - Application services
- `domain/`         - Domain models/entities
- `dto/`            - Data Transfer Objects
- `repository/`     - Repository interfaces
- `infrastructure/` - Data access implementations
- `service/`        - Business logic
- `mapper/`         - Entity/DTO mappers
- `assembler/`      - Assemblers
- `exception/`      - Exception handling
- `config/`         - Configuration classes

---

For workspace-specific Copilot instructions, see `.github/copilot-instructions.md`.
