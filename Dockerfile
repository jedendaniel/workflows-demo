FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /build

COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY src ./src
RUN mvn -B package -DskipTests

FROM eclipse-temurin:21-jre-jammy
WORKDIR /workflows-demo

COPY --from=builder /build/target/*.jar app.jar

EXPOSE 8080

RUN useradd -r -u 1001 appuser
USER appuser

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=docker"]