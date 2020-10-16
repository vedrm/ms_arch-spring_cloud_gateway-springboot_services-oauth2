# ms_arch-spring_cloud_gateway-springboot_services-oauth2
A microservice setup with a Spring Cloud Gateway, a Thymeleaf UI and a Resource server, all with OAuth2 using Spring Security

### Run instructions:
- start UAA authorization server (port 8090): **gradlew -b build.gradle uaa**
- start gateway (8080), front-end (8091), project (9000) services: **mvn spring-boot:run**
- open a browser, hit http://localhost:8080 (gateway), it will redirect to auth server which will bring up login page, enter **_user1/password_**, it will do the authentication and redirect back to http://localhost:8080 (gateway). Now, as per route config in gateway, it will be routed to http://localhost:8091 (front-end)
- http://localhost:8080/api/ast/projects (gateway) gets routed to http://localhost:9000/api/ast/projects (project) as per route config in gateway

### References:
- https://github.com/jgrandja/oauth2login-gateway
- https://github.com/jgrandja/oauth2-protocol-patterns
