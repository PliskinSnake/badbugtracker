FROM openjdk:16
EXPOSE 8080 5432
COPY target/badbugtracker-0.0.1-SNAPSHOT.jar /opt/
ENTRYPOINT ["java", "-jar", "/opt/badbugtracker-0.0.1-SNAPSHOT.jar"]
