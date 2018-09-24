FROM java:8-jre
MAINTAINER Abhishek kumar <ashuindia96@gmail.com>
COPY ./target/Neo4jDataModelling-Service-0.0.1-SNAPSHOT.jar /usr/src/Neo4jDataModelling-Service-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "Neo4jDataModelling-Service-0.0.1-SNAPSHOT.jar"]



