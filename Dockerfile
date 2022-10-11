FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine

WORKDIR /app

COPY target/2memtask-0.0.1-SNAPSHOT-spring-boot.jar .

CMD ["java","-jar","2memtask-0.0.1-SNAPSHOT-spring-boot.jar"]

