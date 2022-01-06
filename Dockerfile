FROM openjdk:11
VOLUME /tmp
ADD target/SpringDocker.jar SpringDocker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringDocker.jar"]