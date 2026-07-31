# Logistics Management System

A comprehensive end-to-end Logistics Management application built with Java 17 (Spring Boot REST API), Angular 21, and MySQL database.

## Features

- **Shipment Tracking**: Real-time tracking of shipments
- **Warehouse Management**: Manage inventory and warehouse operations
- **Driver/Vehicle Management**: Track drivers and vehicles
- **Order Management**: Create and manage orders
- **Delivery Routes**: Optimize and manage delivery routes
- **User Authentication**: Secure user authentication and authorization

## Project Structure

```
logistic-management/
├── backend/                 # Java Spring Boot REST API
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── ...
├── frontend/               # Angular 21 Application
│   ├── src/
│   ├── angular.json
│   ├── package.json
│   └── ...
├── docker-compose.yml      # MySQL + services orchestration
└── README.md
```

## Tech Stack

### Backend
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Spring Security
- MySQL Driver
- Lombok
- MapStruct
- JUnit 5

### Frontend
- Angular 21
- TypeScript
- RxJS
- Angular Material
- Bootstrap 5
- HttpClientModule

### Database
- MySQL 8.0

### DevOps
- Docker
- Docker Compose

## Getting Started

See individual README files in `backend/` and `frontend/` directories for detailed setup instructions.

### Quick Start with Docker

```bash
docker-compose up -d
```

This will start:
- MySQL database (port 3306)
- Backend API (port 8080)
- Frontend (port 4200)

## API Documentation

API endpoints and Swagger documentation available at:
```
http://localhost:8080/swagger-ui.html
```

## Database Schema

Database schema and initialization scripts are located in `backend/src/main/resources/db/`

## Contributing

1. Create a feature branch
2. Commit your changes
3. Push to the branch
4. Create a Pull Request

## License

MIT
