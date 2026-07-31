# Logistic Management System - Setup Guide

## Quick Start

### 1. Start Database
```bash
docker-compose up -d
```

### 2. Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

Backend runs on: `http://localhost:8080`

### 3. Frontend Setup
```bash
cd frontend
npm install
ng serve
```

Frontend runs on: `http://localhost:4200`

## API Documentation

### Base URL
```
http://localhost:8080/api
```

### Available Endpoints

**Orders**: `/orders`
**Shipments**: `/shipments`
**Drivers**: `/drivers`
**Vehicles**: `/vehicles`
**Warehouses**: `/warehouses`
**Users**: `/users`
**Delivery Routes**: `/delivery-routes`

Each endpoint supports:
- `GET /` - Get all
- `GET /{id}` - Get by ID
- `POST /` - Create
- `PUT /{id}` - Update
- `DELETE /{id}` - Delete

## Technology Stack

- **Backend**: Java 17, Spring Boot 3.1, MySQL 8
- **Frontend**: Angular 21, Bootstrap 5
- **Database**: MySQL with Docker Compose
- **Build**: Maven, npm/ng

## Features

✅ Full CRUD operations for all entities
✅ RESTful API architecture
✅ Angular responsive UI
✅ Real-time shipment tracking
✅ Driver and vehicle management
✅ Warehouse management
✅ Delivery route planning
✅ User authentication ready
✅ CORS enabled for development
✅ Docker containerized database

## Project Files Created

### Backend (Java)
- Entity Models (User, Order, Shipment, Driver, Vehicle, Warehouse, DeliveryRoute)
- Repository Interfaces
- Service Classes
- REST Controllers
- Configuration (ModelMapper, Security, CORS)
- Spring Boot Main Application

### Frontend (Angular)
- Components (Dashboard, Orders, Shipments, Drivers)
- Services (Order, Shipment, Driver, Vehicle, User, Warehouse)
- Models/Interfaces
- Routing Module
- App Module
- Main App Component

### Database
- MySQL Docker Compose setup
- SQL initialization script with all tables and indexes
- Pre-configured credentials

### Configuration
- application.yml for Spring Boot
- environment files for Angular
- pom.xml with all dependencies
- package.json for frontend

## Troubleshooting

### Port 3306 already in use
```bash
docker-compose down
docker-compose up -d
```

### Port 8080 already in use
Update `application.yml`:
```yaml
server:
  port: 8081
```

### CORS issues
CORS is enabled for all origins in development mode.

## Next Steps

1. ✅ Database is ready
2. ✅ Backend API is running
3. ✅ Frontend is serving
4. Add authentication endpoints
5. Add authorization with role-based access
6. Add advanced filtering and pagination
7. Deploy to production

Enjoy your Logistic Management System! 🚀
