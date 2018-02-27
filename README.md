# HibernateAuditDemo
Demo for Auditing with Hibernate Envers and Spring Data JPA using Spring Boot

In this example you can see how to use hibernate-envers for Auditing your tables.

This is a Spring Boot Application and it is configured with mysql database.

There are the following entities:

0. AuditEnversInfo --> auditory master table
1. User --> this entity can be a customer or employee.
2. UserRole

For each table (entity) the framework will create the auditory tables.
When starting the application, it will create tables defined in the entity classes
* Anyway there is a script with the DDL of tables (tables.sql)


Rest endpoints
---
I used the postman as a client to test the endpoints, you can import the collection, the file is in:
```
/resources/endpoints/HibernateAudit.postman_collection.json
```
Or if you prefer, you can see the Controllers inside of ```com.sample.controllers``` 
