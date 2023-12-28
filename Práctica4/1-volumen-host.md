# Volúmenes

## HOST

### Volumen tipo host con la imagen nginx:alpine 
### ruta carpeta host: directorio en donde se encuentra la carpeta html en nuestro computador, usar /
/c/Users/joelg/OneDrive - Escuela Politécnica Nacional/Semesters/SextoSemestre/ConstruccionyEvolucionDeSoftware/Practicas/4.-Volumenes-En-Docker/ISWD633-GR1/Práctica4/nginx/html
### ruta carpeta contenedor: /usr/share/nginx/html desde la documentación

### Formato
```
docker run -d --name <nombre contenedor> --publish <mapeo de puertos> -v <ruta carpeta host>:<ruta carpeta contenedor> url: <nombre imagen>
```
### Ejecutado
```
docker run -d --name nginx-srv --publish 8080:80 -v "/c/Users/joelg/OneDrive - Escuela Politécnica Nacional/Semesters/SextoSemestre/ConstruccionyEvolucionDeSoftware/Practicas/4.-Volumenes-En-Docker/ISWD633-GR1/Práctica4/nginx/html:/usr/share/nginx/html" nginx:alpine
```

### ¿Qué sucede al ingresar al servidor de nginx?
Al ingresar al servidor de nginx, se realiza una petición HTTP al puerto 8080 del host, que está mapeado al puerto 80 del contenedor. El servidor nginx recibe la petición y busca el archivo index.html o index.php en la ruta /usr/share/nginx/html del contenedor, que está montada con la carpeta del host que se especificó en el comando docker run. Si el archivo existe y tiene los permisos adecuados, el servidor nginx lo envía como respuesta al cliente. Si el archivo no existe o no tiene los permisos adecuados, el servidor nginx devuelve un error 403 (Forbidden). Lo que sucede en la práctica es lo segundo.

![Servidor nginx sin index.html](/Práctica4/images-for-volumen-host/nginx-server01.png)

### ¿Qué pasa con el archivo index.html del contenedor?
El archivo index.html del contenedor es el mismo que el archivo index.html de la carpeta del host que se montó en el contenedor. Cualquier cambio que se haga en el archivo del host se reflejará en el archivo del contenedor, y viceversa. En este caso, como no existe un archivo index en el host, tampoco aparecerá uno en el contenedor.

### Ir a https://html5up.net/ y descargar un template gratuito - descomprimir en la carpeta html
### ¿Qué sucede al ingresar al servidor de nginx?
Se muestra correctamente el archivo index.html del template descargado

![Servidor nginx con index.html](/Práctica4/images-for-volumen-host/nginx-server02.png)

---
### Eliminar el contenedor
Usamos el comando ```docker rm -f nginx-srv``` para forzar su eliminación.
### ¿Qué sucede al crear nuevamente el mismo contenedor con volumen de tipo host a los directorios definidos anteriormente?
Al crear nuevamente el mismo contenedor con el mismo comando `docker run` y el mismo volumen de tipo host, el contenedor se crea con una nueva identificación y nombre, pero usa el mismo directorio del host que se especificó en el comando anterior. Esto significa que el contenedor puede acceder a los mismos archivos y datos que el contenedor anterior, y que cualquier cambio que se haga en el directorio del host o del contenedor se reflejará en ambos.

### ¿Qué hace el comando pwd?
El comando `pwd` significa "print working directory" y se usa para mostrar el directorio de trabajo actual.

### Volumen tipo host usando PWD y PowerShell
```
docker run -d --name server-nginx --publish published=5000,target=80 -v ${PWD}/html:/usr/share/nginx/html nginx:alpine
```

![Uso de PWD al crear nginx server](/Práctica4/images-for-volumen-host/using-pwd.png)
---
![Servidor nginx con index.html y creado con pwd](/Práctica4/images-for-volumen-host/nginx-server03.png)
