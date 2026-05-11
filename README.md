***REQUISITOS***
- JAVA VERSION 25 o superior



***Como instalar***
Le da a Code y clonar repositorio.
luego arrastra al carpeta raiz a su IDE de confianza



***Como Usar***
- Abre laragon y enciende my sql y apache en localhost 8080.

- entra en la db y le da a localhost. 

- en la seccion de consulta coloca "CREATE DATABASE concesionaria_db" y listo

- ahora en su IDE preferido ejecuta el archivo "SmApplication.java" ubicado dentro de src/main/java/com/conaut/sm/"

- el programa ahora deberia permitir entrar a "http://localhost:8080/api/xxx".
  xxx lo puede reemplazar por cliente, vehiculo, proovedor, etc.

- para añadir datos debe ingresar a postman y darle a post con los datos correspondientes al modelo que usa, ignorando id
  ej
  -CLIENTES
{
    "rut" : "981276344-K",
    "nombre" : "Alexis Tom",
    "email": "alex.tocopilla@example.com"
}

- Le da a send y ahora los cambios deberian verse reflejados en su base de datos local.

- Para borrar debera ingresar a postman y colocar por ejemplo
  si quiero eliminar al cliente que recien creamos debe cambiar a la funcion delete y colocar
  http://localhost:8080/api/clientes/aquicolocalaidquedeseaeliminar



***AUTORES***

- Matias Sandoval
- Sebastian Olivares


