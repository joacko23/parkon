# Imagen base de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Instalamos curl para pruebas de conectividad
RUN apk add --no-cache curl

# Directorio de trabajo
WORKDIR /app

# Copiamos el JAR (recuerda: mvn clean package primero)
COPY target/*.jar app.jar

# Exponemos el puerto del Gateway (suele ser el 8080 o el que hayas definido)
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]