FROM java:8

EXPOSE 8000

ADD /build/libs/configsvr-0.0.1-SNAPSHOT.jar configsvr.jar

ENTRYPOINT ["java", "-jar", "configsvr.jar"]