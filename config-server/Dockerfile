# Usamos una imagen ligera de Java 17 (o la que uses en tu pom.xml)
FROM eclipse-temurin:17-jdk-alpine

# Instalamos curl por si necesitamos hacer healthchecks
RUN apk add --no-cache curl

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR generado por Maven
# Asegúrate de haber ejecutado 'mvn clean package' antes
COPY target/*.jar app.jar

# Exponemos el puerto por defecto del Config Server
EXPOSE 8888

# Comando para arrancar el servicio
ENTRYPOINT ["java", "-jar", "app.jar"]