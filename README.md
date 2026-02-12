API de Estudiantes

Este proyecto corresponde al desarrollo de una API REST construida con Spring Boot.
La aplicación permite registrar estudiantes y consultar la lista de estudiantes almacenados.

El sistema valida que no se puedan registrar dos estudiantes con el mismo ID.

Tecnologías utilizadas

Java

Spring Boot

Gradle

GitHub Actions (Integración continua)

Ejecución del proyecto

Clonar el repositorio:

git clone https://github.com/TU-USUARIO/parcial1.git


Ingresar a la carpeta del proyecto:

cd parcial1


Ejecutar la aplicación:

gradlew bootRun


La aplicación se ejecutará en la siguiente dirección:

http://localhost:8080

Endpoints disponibles
Registrar estudiante

Método: POST
Ruta:

/estudiantes


Ejemplo de cuerpo de la solicitud (JSON):

{
  "id": "000156364",
  "nombre": "Cristiano Ronaldo",
  "carrera": "Ingenieria de Sistemas"
}


Ejemplo usando curl:

curl -X POST http://localhost:8080/estudiantes -H "Content-Type: application/json" -d "{\"id\":\"000156364\",\"nombre\":\"Cristiano Ronaldo\",\"carrera\":\"Ingenieria de Sistemas\"}"


Si se intenta registrar un estudiante con un ID que ya existe, el sistema devolverá un error y no permitirá el registro duplicado.

Listar estudiantes

Método: GET
Ruta:

/estudiantes


Se puede consultar directamente desde el navegador:

http://localhost:8080/estudiantes


Ejemplo:

[
  {
    "id": "000156364",
    "nombre": "Cristiano Ronaldo",
    "carrera": "Ingenieria de Sistemas"
  }
]

Funcionamiento interno

La información se almacena en memoria utilizando una estructura tipo Map.

Si el servidor se reinicia, los datos registrados se eliminan.

El sistema implementa una validación para evitar que se registren estudiantes con el mismo ID.

Integración continua

El proyecto cuenta con un flujo de integración continua configurado en GitHub Actions.
Cada vez que se realiza un push o un merge a la rama principal, el sistema compila automáticamente el proyecto para verificar que no existan errores
