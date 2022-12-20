FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=target/prueba-tecnica-1.0.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]