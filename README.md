# SpringBootAdminClientUsingBasicAuthentication
Spring Boot Admin Client Configuration using Basic HTTP Authentication

Spring Boot Admin Application can be used to manage and monitor our applications.

Client applications register with our Spring Boot Admin Client (via HTTP) or are discovered using Spring Cloud ® (e.g. Eureka, Consul). The UI is just an AngularJs application on top of the Spring Boot Actuator endpoints.

We can monitor the metrics of each of the deployed instances of the micro services

We can monitor the memory metrics of the containers and can modify the performance based on the metrics

We can change the log levels of the deployed instances in the run time without the need of restarting the containers

We can add the security on the management endpoints by implementing Basic, oAuth2 or Session Authentication.

The above properties depicts the way of securing the managements by Basic Authentication.

 

Multiple boot applications, all registering to same boot admin server. These applications have secured management endpoints having different authentication credentials (different username/ password for each application).
The boot admin UI pops up the window to enter the credentials for each application.This way we can  pass the authentication credentials from client, so that admin server automatically reads it and connects to secure endpoints.

 

References :

https://github.com/codecentric/spring-boot-admin

http://codecentric.github.io/spring-boot-admin/2.0.2/
