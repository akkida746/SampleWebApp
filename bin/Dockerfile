FROM openjdk:11
VOLUME /tmp
ADD target/sampleapp-1.jar SpringDocker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringDocker.jar"]