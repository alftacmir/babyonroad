FROM maven:3.8-openjdk-11-slim

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

EXPOSE 9000

CMD ["java", "-jar", "target/tu-aplicacion.jar"]
