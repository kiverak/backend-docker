FROM bellsoft/liberica-openjdk-alpine:21

EXPOSE 8080

ADD build/libs/backend-docker-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=db,logging", "-jar", "/app/app.jar"]
