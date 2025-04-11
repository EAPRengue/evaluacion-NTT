# evaluacion-NTT

Descargando el proyecto puede ejecutarlo en su IDE favorito.
El proyecto está realizado en:
- JAVA 11
- BBDD hsqldb

Puede usar Postman para revisar los diferentes endpoint.

GET      /api/usuarios        Obtener todos los usuarios
GET      /api/usuarios/{id}   Obtener un usuario por su ID
POST     /api/usuarios        Crear un nuevo usuario
PUT      /api/usuarios/{id}   Actualizar un usuario existente
DELETE   /api/usuarios/{id}   Eliminar un usuario

Puede usar este json para ingresar datos a la tabla:

{
	"nombre": "Juan Rodriguez",
	"correo": "juan@rodriguez.org",
	"contrasena": "hunter2",
	"telefonos": [
		{
			"numero": "1234567",
			"codigoCiudad": "1",
			"codigoPais": "57"
		}
	]
}
