# Contenedores

### Crear un contenedor

```
docker create --name <nombre contenedor> <nombre imagen>:<tag>
```

### Listar los contenedores ejecutándose

```
docker ps 
docker ps | grep <nombre contenedor>

```

### Listar los contenedores ejecutándose o no

```
docker ps -a
```

### Para iniciar un contenedor

```
docker start <nombre contenedor>

```

### Para detener un contenedor

```
docker stop <nombre contenedor>
```

### Para crear un contenedor y ejecutarlo inmediatamente

```
docker run --name <nombre contenedor> <nombre imagen>:<tag>
```

### Para crear un contenedor y ejecutarlo inmediatamente sin estar vinculados al mismo

```
docker run -d --name <nombre contenedor> <nombre imagen>:tag
```

### Para eliminar un contenedor

```
docker rm <nombre contenedor>
```

### Para eliminar un contenedor que esté ejecutándose

```
docker rm -f <nombre contenedor>
```
### Para inspecionar un contenedor 

```
docker inspect <nombre contenedor>
```



### Para crear un mapeo de puertos (puerto host y puerto contenedor)

```
docker run -d --name <nombre contenedor> -p <puerto host>:<puerto contenedor> <nombre imagen>:<tag>

```

### Para mapear más de un puerto

```
docker run -d --name <nombre contenedor> -p <puerto host 01>:<puerto contenedor 01> -p <puerto host 02>:<puerto contenedor 02> <nombre imagen>:<tag>
```