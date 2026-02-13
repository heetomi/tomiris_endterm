Lost & Found REST API

This project is a simple Lost and Found system developed as a REST API using Spring Boot. The application allows users to create, view, update and delete lost items. The main goal of this project is to demonstrate REST architecture, database connection using JDBC, usage of design patterns (Singleton, Factory and Builder), exception handling and API documentation with Swagger. This project was completed as part of my Endterm assignment.

The technologies used in this project include Java 17, Spring Boot, Maven, PostgreSQL, JDBC, Swagger (OpenAPI) and IntelliJ IDEA.

The project follows a layered structure. The controller layer handles REST endpoints and HTTP requests. The service layer contains business logic. The repository layer works with the database using JDBC. The model package contains the LostItem entity. The exception package provides global error handling. The patterns package includes Singleton, Factory and Builder implementations.

The application supports basic CRUD operations: creating a lost item, retrieving all items, retrieving an item by id, updating and deleting items. Swagger UI is used to test the API.

API endpoints include GET /api/items, GET /api/items/{id}, POST /api/items, PUT /api/items/{id} and DELETE /api/items/{id}.

The database used is PostgreSQL with a table named lost_items containing id, name and date_found columns.

Swagger UI is available at http://localhost:8081/swagger-ui/index.html
.

To run the project, clone the repository, open it in IntelliJ IDEA, configure PostgreSQL in application.properties, run DemoApplication and open Swagger UI.

Screenshots of Swagger UI, requests, database and UML diagram are included in the docs/screenshots folder.
