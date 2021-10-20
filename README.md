# autopp-backend
---
_Backend para el registro de autos y consulta del pico y placa_

## Comenzando 🚀
---
_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Deployment** para conocer como desplegar el proyecto.

## Construido con 🛠️
---
* **Spring Boot 2**
* **Java 8 o Java11**
* **PostgreSQL Version 13**
### Instalación 🔧
---
_1. Clone el backend localmente_

### Pre-requisitos 📋
---
Crear una una nueva base de datos ejemplo: **autoppbd** o puede utilizar la base de datos por defecto: **postgres** y reemplazar la cadena de conexion por el nombre de la base, usuario y contraseña en el archivo **application.properties** del proyecto
```
spring.jpa.database=postgresql
spring.jpa.show-sql=false
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:postgresql://localhost/autoppbd
spring.datasource.username=postgres
spring.datasource.password=4060
```
## Despliegue 📦
---
_* Limpie y construya el proyecto con maven_
_* Deploye el proyecto localmente_

### Tabla de Parametrización Pico y Placa 📋
---
_Al construir y deployar el proyecto se desplegara la base de datos y sus tablas_

**Ejecutar el siguiente DML que es la tabla de parametrización del Pico y Placa**
```
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (1, 'Lunes', '', 'X', 'X', '', '', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (2, 'Martes', '', '', '', 'X', 'X', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (3, 'Miercoles', '', '', '', '', '', 'X', 'X', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (4, 'Jueves', '', '', '', '', '', '', '', 'X', 'X', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (5, 'Viernes', 'X', '', '', '', '', '', '', '', '', 'X');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (6, 'Sabado', '', '', '', '', '', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (7, 'Domingo', '', '', '', '', '', '', '', '', '', '');
```

## Autor ✒️

* **Gustavo Parco** - *Evalución* - [Gustav406o](https://github.com/Gustav4060)


