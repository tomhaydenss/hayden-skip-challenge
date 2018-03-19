# Technical Challenge for Sao Paulo Van Hack Fair

## API Definition 

API Definition is available at the following [link] (http://api-vanhack-event-sp.azurewebsites.net/swagger/)

## Instructions

To run the application just type:

	mvn spring-boot:run

The sql script used to load the database is located at:

	src/main/resources/data-h2.sql 

You can run the following command to create an User:

	curl -X POST localhost:8080/api/v1/Customer -d '{"email": "tom@gmail.com", "name": "tom", "address": "vila gumercindo", "password": "string"}' -H "Content-Type: application/json"

And run the following command to add an Order:

	curl -X POST localhost:8080/api/v1/Order -H "Content-Type: application/json" -d '{ "customerId": 1, "deliveryAddress": "vila gumercindo", "contact": "3563-4044", "storeId": 1, "orderItems": [ { "productId": 1, "price": 12.5, "quantity": 2, "total": 25 } ], "total": 25 }