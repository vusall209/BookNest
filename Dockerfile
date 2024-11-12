# Temel imaj olarak Java 17 kullanıyoruz
FROM openjdk:17-jdk-slim

# Çalışma dizinini /app olarak belirliyoruz
WORKDIR /app

# Gradle ile derlenmiş jar dosyasını konteynıra kopyalıyoruz
COPY build/libs/BookNest-0.0.1-SNAPSHOT.jar app.jar

# Uygulama başlatıldığında çalışacak komut
CMD ["java", "-jar", "app.jar"]
