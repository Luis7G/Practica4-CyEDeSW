# Volúmenes
## ANÓNIMO
Un volumen anónimo es un volumen que no tiene un nombre específico y que se crea automáticamente por Docker cuando se ejecuta un contenedor. Un volumen anónimo se puede crear usando la opción -v con solo la ruta del contenedor, sin especificar la ruta del host o el nombre del volumen.
Usamos:

```
docker run -d --name server-nginx -v /usr/share/nginx/html --publish published=9800,target=80 nginx:alpine
```

El contenedor expone el puerto 80 y lo publica en el puerto 9800 del host. También se crea un volumen anónimo que se monta en el directorio /usr/share/nginx/html del contenedor, que es donde nginx almacena los archivos HTML del sitio web.

### Para eliminar el contenedor y el volumen

Para eliminar el contenedor y el volumen anónimo, se puede usar el comando `docker rm` con las opciones -f y -v. 
Usemos:

```
docker rm -fv server-nginx
```
Esto elimina el contenedor server-nginx y lo detiene si está en ejecución, usando la opción -f. También elimina el volumen anónimo asociado al contenedor, usando la opción -v. Si no se usa la opción -v, el volumen anónimo permanecerá en el host y ocupará espacio.
