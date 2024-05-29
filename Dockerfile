FROM openjdk:21
WORKDIR /app

ENV MONGO_DATABASE="office"
ENV MONGO_USER="root"
ENV MONGO_PASSWORD="admin"
ENV MONGO_CLUSTER="database.ppdbwzx.mongodb.net"

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]