This is a simple CRUD API mimicking a Library Managemet System.
The techstack used is Springboot + Kotlin with Postgres as DB mapped using Mybatis ORM.

To run:
 -Clone the project locally using git clone.
 -Copy the dependencies in the pom.xml and then build.
 -Hit the following endpoints:
    1. GET - http://localhost:8080/books/{id} [use id as 1 to 9, user registration and auth will be added later on]
    2. POST - http://localhost:8080/books [to add books manually, see the Book model to get idea of fields]
