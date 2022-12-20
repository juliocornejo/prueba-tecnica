# prueba-tecnica
El siguiente servicio es para consumir las APIS del desafio

## Requirements

Para compilar, construir y ejecutar la aplicacion se necesita:
- [JDK 8]
- [Maven 3]

Para compilar con maven y generar la cobertura del proyecto con jacoco, se debe ejecutar
```
mvn clean install -U
```
Para correr el proyecto con comando maven se debe ejecutar.
```
mvn spring-boot:run
```
### USO Y DOCUMENTACION
Documentacion y uso de Swagger
* [Documentacion del servicio](http://localhost:8080/swagger-ui.html#/)

Uso de la api

* [Consumir el servicio](http://localhost:8080/golan-api/v1/prueba/{nombreDePrueba})
* [Body]({"nombre cliente": "A","direccion sucursal": "Ckdsnbdskdbsjnkdsbsbn"})
Para consultar por el estado (UP-DOWN) del servicio

* [Conocer el estado del servicio](http://localhost:8080/api/v1/actuator/health)

Para consultar por los logs del servicio

* [observar los logs del servicio](http://localhost:8080/api/v1/actuator/logfile)

Para consultar la cobertura

* [observar la cobertura(abrir con el navegador)](target\site\jacoco\index.html)
