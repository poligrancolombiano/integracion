FROM openjdk:11
ENV TZ="America/Bogota"
ADD target/intelliging-core.jar build/intelliging-core.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","build/libs/integracion.jar"]