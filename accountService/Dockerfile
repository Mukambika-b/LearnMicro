#Start with a base image containing java runtime
FROM eclipse-temurin:21-jdk-noble

#Information around who maintains the image
LABEL maintainer = Mukambika

#Add the application's jar to the image
COPY target/accountService-0.0.1-SNAPSHOT.jar accountService-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accountService-0.0.1-SNAPSHOT.jar"]