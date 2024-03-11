FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN apt-get update && apt-get install -y mysql-server

RUN service mysql start && \
     mysql -e "CREATE USER 'root'@'%' IDENTIFIED BY 'root';" && \
     mysql -e "GRANT ALL PRIVILEGES ON babyonroad.* TO 'root'@'%';" && \
     mysql -e "CREATE DATABASE IF NOT EXISTS babyonroad;" && \
     mysql -e "FLUSH PRIVILEGES";
    
    
RUN mvn clean package


EXPOSE 9000

CMD ["java", "-jar", "target/babyonroad-0.0.1-SNAPSHOT.jar"]
