# Operaciones con Redes

### Crear una red de tipo bridge

```
docker network create <nombre red> -d bridge
```

### Crear un contenedor vinculado a una red

```
docker run -d --name <nombre contenedor> --network <nombre red> <nombre imagen>
```

### Para saber a qué red está conectado un contenedor

```
docker inspect <nombre contenedor>
docker network inspect <nombre red> 
```

### Vincular contenedor a una red

```
docker network connect <nombre red> <nombre contenedor>

```

### Para desvincular un contenedor de una red

```
docker network disconnect <nombre red> <nombre contenedor>
```

### Para listar las redes existentes

```
docker network ls
```