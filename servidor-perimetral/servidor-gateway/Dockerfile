# Etapa 1: Construir la aplicación
FROM gradle:8.1.1-jdk17-jammy AS build
WORKDIR /home/gradle/project
COPY . /home/gradle/project
RUN chmod +x ./gradlew
RUN ./gradlew build -x test
# Opcional: Listar los archivos para verificar la construcción
# RUN ls /home/gradle/project/build/libs/

# Etapa 2: Ejecutar la aplicación en un contenedor
FROM eclipse-temurin:17.0.7_7-jre-alpine
WORKDIR /app
# Aquí asumimos que solo hay un JAR en el directorio de construcción.
COPY --from=build /home/gradle/project/build/libs/*.jar /app/servidor-gateway.jar
ENTRYPOINT ["java", "-jar", "/app/servidor-gateway.jar"]
