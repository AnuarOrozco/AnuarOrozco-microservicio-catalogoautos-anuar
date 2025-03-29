# 🚗 Catálogo de Autos - Microservicio Spring Boot

<div align="center">
  <img src="https://img.shields.io/badge/Java-17-%23ED8B00?logo=java" alt="Java 17">
  <img src="https://img.shields.io/badge/Spring_Boot-3.2.4-%236DB33F?logo=spring" alt="Spring Boot">
  <img src="https://img.shields.io/badge/H2-Database-%23FF4500?logo=h2" alt="H2 Database">
  <img src="https://img.shields.io/badge/Lombok-%23000000?logo=lombok" alt="Lombok">
</div>

Microservicio RESTful para gestión de catálogo vehicular con Spring Boot y H2 Database.

## 🌟 Características
- Consulta de vehículos por ID o listado completo
- Base de datos H2 en memoria
- Arquitectura por capas (Controller-Service-Repository)
- Documentación implícita mediante endpoints REST
- Configuración optimizada para desarrollo

## 🛠️ Tecnologías
- Java 17
- Spring Boot 3.2.4
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## 🚀 Instalación
1. Clonar repositorio
2. Importar como proyecto Maven en IDE
3. Ejecutar la clase principal `CatalogoAutosApplication`
4. Acceder a los endpoints

## 📌 Endpoints
| Método | Ruta               | Descripción          |
|--------|--------------------|----------------------|
| GET    | /api/autos         | Lista todos los autos|
| GET    | /api/autos/{id}    | Busca auto por ID    |

## 🌐 Consola H2
Accede a la interfaz web en: http://localhost:8080/h2-console

Credenciales:
- JDBC URL: `jdbc:h2:mem:db_autos`
- User: `sa`
- Password: (vacío)

## 📊 Estructura del Proyecto
src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── ejemplo/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── service/
│ └── resources/
│ ├── application.properties
│ └── data.sql
