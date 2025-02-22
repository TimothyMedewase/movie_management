# Movie Management Backend
==========================

## Description
The Movie Management Backend is a Java-based application designed to manage movie-related data. It provides a robust framework for creating, reading, updating, and deleting (CRUD) movie entities. This repository contains the source code for the backend application, including the model, repository, service, and RESTful API layers.

## Table of Contents
1. [Installation Instructions](#installation-instructions)
2. [Usage Guide](#usage-guide)
3. [Features](#features)
4. [Example Code Snippets](#example-code-snippets)
5. [License](#license)

## Installation Instructions
To install and run the Movie Management Backend application, follow these steps:

1. **Clone the repository**: `git clone https://github.com/your-username/movie-management-backend.git`
2. **Navigate to the project directory**: `cd movie-management-backend`
3. **Build the project**: `mvn clean package`
4. **Run the application**: `java -jar target/movie-management-backend.jar`

## Usage Guide
The Movie Management Backend application provides a RESTful API for interacting with movie data. The following endpoints are available:

* **Create Movie**: `POST /movies` - Create a new movie entity
* **Get Movie**: `GET /movies/{id}` - Retrieve a movie entity by ID
* **Update Movie**: `PUT /movies/{id}` - Update an existing movie entity
* **Delete Movie**: `DELETE /movies/{id}` - Delete a movie entity

## Features
The Movie Management Backend application includes the following features:

* **CRUD operations**: Create, read, update, and delete movie entities
* **Validation**: Validate movie data to ensure consistency and accuracy
* **Error handling**: Handle and respond to errors and exceptions

## Example Code Snippets
The following code snippet demonstrates how to create a new movie entity using the RESTful API:
```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Create a new movie entity
Movie movie = new Movie("Movie Title", "Movie Description", "Movie Genre");

// Set up the HTTP client and request
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("http://localhost:8080/movies"))
        .POST(HttpRequest.BodyPublishers.ofString(JsonUtil.toJson(movie)))
        .build();

// Send the request and get the response
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

// Check the response status code
if (response.statusCode() == 201) {
    System.out.println("Movie created successfully");
} else {
    System.out.println("Error creating movie: " + response.body());
}
```
## License
The Movie Management Backend application is licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0). You are free to use, modify, and distribute the code under the terms of this license.
