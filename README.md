# SpringBootRest-without-JSP
SpringBootRest without JSP. Postman is used to send/receive the request/response.

1)Added a controller in controller package java page to serve all requests and send response
2)In controller added get,post,put,delete methods to serve the respective purpose
3)Configured H2 Database and added few queries to save the Data in Database in data.sql file(as the database is volatile, data will be erased when ever we rerun the application)
4)Created a Pojo class of Alien in module package
5)Created an Interface in DAO package by extending JPARepository for Alien and Integer is primary key
6)Requests/Response can be sent/receive from Postman client.

