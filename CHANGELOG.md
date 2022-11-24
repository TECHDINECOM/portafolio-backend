# protafoliobackend

### 2022/11/24 - Corregido un error que me presentaba el DataSource 'url' al momento de ejecutar el proyecto

*  La correccion radico en agregar al aplication.properties la siguiente instruccion:
    spring.datasource.hikari.jdbc-url = ${spring.datasource.url}
  Lo que hace es asignarle a hikari.jdbc-url el valor asignado en el spring.datasource.url eso permitio que el proyecto pudiera ejecutarse correctamente


### 2022/11/22 - Inicialización del Proyecto JAVA-SPRINGBOOT APIREST

BACKEND - Este repositorio corresponde al proyecto de portafolio final a realizar para aprobar la capacitacion de Argentina Programa (YO PROGRAMO)

*  Corregi la configuración del proyecto para que el ORM Hibernate pueda crear las tablas en la DB.

*  Cree las Entidades Usuarios y Roles para poder manejar el acceso al portafolio y la administración de su backoffice. Tendre algunas opciones que solo podra realizar un administrador (el resto será comun para los usuarios).


