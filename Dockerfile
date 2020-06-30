# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
WORKDIR usr/src
# copy application JAR (with libraries inside)
COPY ./target/eks-sample-app-1.0.jar /usr/src/eks-sample-app-1.0.jar
# specify default command
CMD ["java", "-jar", "eks-sample-app-1.0.jar"]
