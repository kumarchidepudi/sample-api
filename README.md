# Sample API

This is a sample Spring Boot application.

## Prerequisites

- Java 17
- Maven
- IntelliJ IDEA (optional, but recommended)

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/your-username/your-repository.git
cd your-repository
```

### Build the Project

```sh
mvn clean install
```

### Run the Application

```sh
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Welcome Controller

- **GET** `/welcome/hello`
  - Response: `"Hello I'm from the controller"`

## Making HTTP Requests

You can use the built-in HTTP client in IntelliJ IDEA to make HTTP requests. Create a file named `scratch.http` and add the following content:

```http
###
GET http://localhost:8080/welcome/hello
```

## Running HTTP Commands in Terminal

You can also use `curl` to make HTTP requests from the terminal:

```sh
curl -X GET http://localhost:8080/welcome/hello
```

## License
You're welcome :)
