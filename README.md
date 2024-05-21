# API Rest con Spring Boot y Jersey

Este proyecto es una aplicación de ejemplo que utiliza Spring Boot y Jersey para construir una API RESTful en Java.

## Requisitos

- Java JDK 17 o superior
- Apache Maven 3.6.3 o superior

## Instrucciones de Uso

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/MiguelAntonioRS/My-First-API-Spring-Boot.git
   
2. Compilar el Proyecto

Desde el directorio raíz del proyecto, ejecuta:
```bash
mvn clean install
```
3. Ejecutar la Aplicación
```bash
   java -jar target/apiRest-0.0.1-SNAPSHOT.jar
```
4. Acceder a la API

    Una vez que la aplicación esté en ejecución, puedes acceder a la API desde tu navegador o herramienta de cliente REST favorita. Aquí tienes algunos ejemplos de endpoints disponibles:
        Listar todos los boots: GET http://localhost:8080/boot
        Obtener un boot específico por nombre: GET http://localhost:8080/boot/{name}
        Agregar un nuevo boot: POST http://localhost:8080/boot

## Configuración Adicional

El proyecto utiliza Maven para gestionar las dependencias y construir el proyecto. La configuración de Jersey se realiza en la clase JerseyConfig, donde se especifica la ruta base de la aplicación.
Estructura del Proyecto

  src/main/java/com/example/apiRest: Contiene el código fuente de la aplicación.

   controllers: Controladores REST para manejar las peticiones HTTP.
       
   models: Clases que representan los modelos de datos.
        
   services: Servicios que realizan la lógica de negocio. 
        
   src/main/resources: Contiene los recursos de configuración.
        
   pom.xml: Archivo de configuración de Maven. 
