# MySQL

### Para crear un contenedor con MySQL asignando una contrasenia para el usr root

```
docker run -d --name <nombre contenedor> -e MYSQL_ROOT_PASSWORD=<valor> mysql:8
```

### Para crear un contenedor con MySQL creando un usuario no-admin

```
docker run -d --name <nombre contenedor> -e 
```

### Para crear un contenedor de MySQL usando variables de entorno desde un archivo plano

```
docker run -d --name <nombre contenedor> --env-file=variables.txt <imagen>
```

### Cliente de MySQL (PhpMyAdmin)

```
```