# Volúmenes
## NOMBRADO

### Crear volumen

```
docker volume create vol-postgres
```

### ¿Cuál es el Mountpoint de vol-postgres?

El Mountpoint de vol-postgres es el directorio en el host donde se almacenan los datos del volumen. Para saber cuál es el Mountpoint de un volumen, se puede usar el comando `docker volume inspect`.
Usamos:
```
docker volume inspect vol-postgres
```

Esto mostrará la siguiente salida :

```
[
    {
        "CreatedAt": "2023-12-28T16:31:59Z",
        "Driver": "local",
        "Labels": null,
        "Mountpoint": "/var/lib/docker/volumes/vol-postgres/_data",
        "Name": "vol-postgres",
        "Options": null,
        "Scope": "local"
    }
]
```

El campo "Mountpoint" indica la ruta del directorio en el host donde se guardan los datos del volumen. En este caso, el Mountpoint es `/var/lib/docker/volumes/vol-postgres/_data`.

### ¿Cómo acceder a ese Mountpoint?

Para acceder a ese Mountpoint, se puede usar el comando `cd` para cambiar el directorio de trabajo al Mountpoint. 
Usamos:
```
cd /var/lib/docker/volumes/vol-postgres/_data
```

Esto nos llevará al directorio donde se almacenan los datos del volumen. Allí se podrá ver los archivos y directorios que corresponden a la base de datos PostgreSQL que se usa en el contenedor.

### Crear una red para postgres

Para crear una red para postgres, se puede usar el comando `docker network create` con el driver bridge, que es el driver predeterminado para las redes de Docker. 

```
docker network create net-postgres
```

### Servidor postgres usando el volumen nombrado
```
docker run -d --name srv-postgres -e POSTGRES_DB=db_drupal -e POSTGRES_PASSWORD=12345 -e POSTGRES_USER=user_drupal -v vol-postgres:/var/lib/postgresql/data --network net-postgres postgres
```

### ¿Qué ha sucedido en vol-postgres?

Al crear el contenedor de PostgreSQL usando el volumen nombrado vol-postgres, se ha inicializado la base de datos en el directorio /var/lib/postgresql/data del contenedor. Este directorio se ha sincronizado con el directorio del host que corresponde al Mountpoint del volumen. Esto significa que los datos de la base de datos se han guardado tanto en el contenedor como en el host, y que cualquier cambio que se haga en uno se reflejará en el otro. Esto permite que la información persista incluso si el contenedor se elimina o se reinicia, ya que el volumen no depende del ciclo de vida del contenedor.


