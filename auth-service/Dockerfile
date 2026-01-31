# Usamos la misma imagen base de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Instalamos curl para poder verificar si Eureka está vivo desde Docker
RUN apk add --no-cache curl

# Directorio de trabajo
WORKDIR /app

# Copiamos el JAR generado (asegúrate de hacer mvn clean package antes)
COPY target/*.jar app.jar

# Exponemos el puerto por defecto de Eureka
EXPOSE 9999

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]