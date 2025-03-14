# Read Me First
SpringBoot with Kafka Illustration

# Technologies
- JDK 17
- Maven
- Spring Boot 3
- Apache Kafka

# Setup Kafka
- Download latest [Kafka](https://kafka.apache.org/downloads)
- Navigate to <kafka install dir>/config. 
  - Edit server.properties 
  - Set log.dirs property to some local path 
- Start kafka with Zookeeper
  - Start Zookeeper service
    - $ <kafka install dir>/bin/zookeeper-server-start.sh config/zookeeper.properties
    - It will run on port 2181
  - Start kafka broker service
    - $ <kafka install dir>/bin/kafka-server-start.sh config/server.properties
    - It will run on port 9092

# How to run
- Run the application as SpringBoot application

# Post message 
1. Use Postman or any other API testing client and submit following request to publish message to kafka
    - URL:-          http://localhost:8080/api/v1/kafka/publish
    - Method:-       POST
    - Headers:-      Content-Type = application/json
    - Request Body:- {"name":"PG","album":"Principal","composer":"testing"}

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.0/maven-plugin/reference/html/#build-image)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#messaging.kafka)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#web)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

