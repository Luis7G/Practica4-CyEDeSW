# Operaciones con contenedores

### Iniciando una sesión de shell dentro del contenedor de Docker 
```
docker exec <nombre contenedor> <programa o comando>
```

### Para ejecutar un shell interactivo en un contenedor de Docker especificado.
```
docker exec -i <nombre contenedor> <programa o comando>
```

### Para ejecutar un shell interactivo bidireccional en un contenedor de Docker especificado.
```
docker exec -it <nombre contenedor> <programa o comando>
```

### Para ver los logs de un contenedor

```
docker logs <nombre contenedor>
```

### Para crear un contenedor con variables de entorno

```
docker run -d --name <nombre contenedor> -e <nombre variable>=valor -e <nombrevariable>=valor <nombre imagen>:<tag>
```