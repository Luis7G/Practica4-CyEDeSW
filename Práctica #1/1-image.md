# Comandos para imágenes

### Listar imágenes

```
docker images
```


### Descargar imagen

```
docker pull <nombre imagen> 
docker pull <nombre imagen>:<tag>
```

### Filtrar imágenes

```
docker images | grep <termino a buscar>

```

### Inspeccionar una imagen

```
docker inspect <nombre imagen>
docker inspect <nombre imagen>:<tag>
```


### Para eliminar una imagen

```
docker rmi <nombre imagen>:<tag>
docker rmi -f <nombre imagen>:<tag>
```

