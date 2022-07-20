FROM openjdk:8
VOLUME /tmp
VOLUME /var/data
VOLUME /var/log

ARG JAR_FILE  target/*.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]