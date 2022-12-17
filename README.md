# Prueba Técnica
Hola, esta es una prueba técnica para candidatos a incorporarse como desarrolladores a Golan SPA.

## Objetivo
Debes crear una API REST con Java 8 utilizando el framework Spring Boot conectado a una base de datos MySQL. Tránquilo que será algo simple, solo deberás exponer un método utilizando el verbo `HTTP GET` para mostrar datos en formato `JSON`.

Eres libre de utilizar el IDE y el gestor de proyecto y dependencias que quieras.  
De todas formas te recomendámos usar el STS4 https://spring.io/tools y Spring Initializr https://start.spring.io/

## Instrucciones
1. Hace un fork público de este repositorio en tu cuenta de Github
2. Clona ese repositorio en tu equipo local
3. Crea una rama nueva con el formato `tunombre-tuapellido`
4. Importa en una base de datos MySQL el contenido del archivo `prueba.sql`. Esta contiene las tablas "cliente" y "sucursal" con datos dentro
5. Crea un proyecto con Spring Boot dentro del repositorio, este debe aceptar una petición `HTTP GET` para el end-point `/golan-api/v1/prueba`
6. La petición deberá ser respondida con un `JSON` el cuál debe entregar los datos "nombre cliente" y "dirección sucursal" para el cliente llamado exactamente "JOSE TORRES" (ya viene insertado en la base de datos) 
7. Cuando estés listo, comitea tus cambios y sube tu rama a Github con un push
8. Ve a tu repositorio en Github, situate en la rama nueva y realiza un pull request

Consultas a omar@golan.cl

¡Éxito!
