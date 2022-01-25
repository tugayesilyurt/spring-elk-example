FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/spring-elk-example
COPY . /opt/spring-elk-example
RUN mvn clean install 

# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=spring-elk-example.jar

WORKDIR /opt/spring-elk-example

COPY --from=maven /opt/spring-elk-example/target/${JAR_FILE} /opt/spring-elk-example/

ENTRYPOINT ["java","-jar","spring-elk-example.jar"]