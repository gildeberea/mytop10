# mytop10

Se trata de un servicio REST simple que se encargará de gestionar las peticiones CRUD sobre la entidad User, 
que tiene como propiedades dos Strings, firstName y lastName.

Pasos:

Instalar mongodb. En principio para el puerto por defecto (27017). No es necesario crear la base de datos, la gestionará y creará el 
   servicio (el servicio creará la base de datos mytop10 en tu local si lo necesita). 
Iniciar el proyecto: java -jar mytop10-1.0.0.jar
Acceder a localhost:8080/swagger-ui.html y ahi apareceran las descripciones de los endpoints.
