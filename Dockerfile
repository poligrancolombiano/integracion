FROM openjdk:11
ENV TZ="America/Bogota"
ADD build/libs/integracion.jar build/libs/integracion.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","build/libs/integracion.jar"]