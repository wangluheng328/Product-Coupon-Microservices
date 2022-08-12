# Product-Coupon-Microservices
 
 ### Introduction
 
 This microservice demo project is based on Spring Cloud and Eureka. It consists of two major types of microservices: product and coupon. The goal is to let them talk to each other to return a calculated price to us users.
 
 ### Achievements
 
 - Implemented server-side load balancing with API Gateway and client-side load balancing with Ribbon
 - Established Fault Tolerance with Resilience 4j including Retry and Fallback
 - Enabled distributed tracing with Sleuth and installed Zipkin to visualize the flow of requests
 - Implemented centralized configurations with Spring Cloud Bus and RabbitMQ; a cloud-bus-level configuration refresh will update all microservices’ configs
 
 ### Instruction To Use
 
 To demo/launch this project, do the following:
 - Clone this repository to local
 - Create corresponding tables in your local MySQL database
 - Add the url, username, password of your DB to the config files in the `configrepo` folder
 - Move the `configrepo` repository folder to somewhere you desire, and add that path to the application.properties file in the ConfigServer module.
 - (Note that I also included the RabbitMQ folder which contains all files needed; feel free to edit the username, password, port, etc.)
 
Notes: Section 14 Null
 
