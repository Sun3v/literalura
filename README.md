### **README**

# Catálogo de Literatura - Desafío Alura LATAM

Este proyecto forma parte del desafío propuesto por **Alura LATAM**. Es una aplicación de catálogo de literatura que permite gestionar libros y autores, utilizando **Spring Boot**, **PostgreSQL**, y **JPA**. La aplicación consume datos desde la API de **Gutendex** y permite realizar operaciones CRUD en una base de datos configurada por el usuario.

---

## **Características Principales**
1. Buscar un libro por título y registrarlo en la base de datos.
2. Listar todos los libros registrados en la base de datos.
3. Buscar un autor y registrarlo en la base de datos.
4. Listar autores vivos en un año determinado.
5. Listar libros registrados por idioma.
6. Configuración dinámica de la base de datos mediante variables de entorno.

---

## **Requisitos**
- **Java 17** o superior.
- **Maven** para la gestión de dependencias.
- Una base de datos PostgreSQL u otra base de datos compatible.
- Conexión a internet para consumir datos desde la API de Gutendex.

---

## **Configuración Inicial**

### 1. **Clonar el repositorio**
Clona este repositorio en tu máquina local:
```bash
git clone https://github.com/tu-usuario/literalura.git
```

### 2. **Configurar el archivo `application.properties`**
Crea un archivo `application.properties` en la ruta `src/main/resources` con el siguiente contenido, ajustando las variables de entorno a tu base de datos y sistema:

```properties
# Nombre de la aplicación
spring.application.name=literalura

# ---- CREDENCIALES (MODIFICAR SEGÚN LA BASE DE DATOS) ----
spring.datasource.url=${DB_HOST}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect

# VERIFICA CAMBIOS EN BASE DE DATOS (UPDATE)
spring.jpa.hibernate.ddl-auto=update

# MUESTRA LOS LOGS DE BASE DE DATOS
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```

#### Variables de entorno requeridas:
- **`DB_HOST`**: URL de la base de datos. Ejemplo: `jdbc:postgresql://localhost:5432/literalura`.
- **`DB_USER`**: Usuario de la base de datos.
- **`DB_PASSWORD`**: Contraseña de la base de datos.

### 3. **Dependencias**
Verifica que las dependencias en el archivo `pom.xml` incluyan las necesarias para Spring Boot, JPA y PostgreSQL. Ejemplo:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

### 4. **Iniciar la aplicación**
Ejecuta la aplicación desde tu IDE o mediante Maven:
```bash
mvn spring-boot:run
```

### 5. **Probar la aplicación**
La aplicación estará disponible en `http://localhost:8080`.

---

## **Estructura del Proyecto**

```
src/
├── main/
│   ├── java/
│   │   ├── com.alura.literalura/
│   │   │   ├── model/        # Entidades del proyecto
│   │   │   ├── repository/   # Repositorios JPA
│   │   │   ├── service/      # Lógica de negocio
│   │   │   ├── controller/   # Controladores REST
│   │   │   └── LiteraluraApplication.java  # Clase principal
│   └── resources/
│       ├── application.properties  # Configuración
│       └── static/                 # Archivos estáticos (opcional)
└── test/                           # Tests
```

---

## **API de Gutendex**
La aplicación utiliza la API de [Gutendex](https://gutendex.com) para consultar libros y autores. 

Ejemplo de llamada:
```
GET https://gutendex.com/books/?search=titulo_del_libro
```

---

¡Gracias por participar en el desafío Alura LATAM y disfrutar de este proyecto de Catálogo de Literatura! 😊
