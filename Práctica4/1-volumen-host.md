# Volúmenes

## HOST

### Volumen tipo host con la imagen nginx:alpine 
### ruta carpeta host: directorio en donde se encuentra la carpeta html en nuestro computador, usar \\
### ruta carpeta contenedor: /usr/share/nginx/html desde la documentación

```
docker run -d --name <nombre contenedor> --publish <mapeo de puertos> -v <ruta carpeta host>:<ruta carpeta contenedor> url: <nombre imagen>
```

### ¿Qué sucede al ingresar al servidor de nginx?
### ¿Qué pasa con el archivo index.html del contenedor?
### Ir a https://html5up.net/ y descargar un template gratuito - descomprimir en la carpeta html
### ¿Qué sucede al ingresar al servidor de nginx?
### Eliminar el contenedor
### ¿Qué sucede al crear nuevamente el mismo contenedor con volumen de tipo host a los directorios definidos anteriormente?
### ¿Qué hace el comando pwd?


### Volumen tipo host usando PWD y PowerShell
```
docker run -d --name server-nginx --publish published=5000,target=80 -v ${PWD}/html:/usr/share/nginx/html nginx:alpine
```