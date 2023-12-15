# Wordpress

### Crear red

```
docker network create net-wp -d bridge

```

### Crear contenedor de MySQL

```
docker run -d --name server-mysql -e MYSQL_ROOT_PASSWORD=12345 -e MYSQL_DATABASE=courses -e MYSQL_USER=user-wp -e MYSQL_PASSWORD=12345 --network net-wp mysql:8

```

### Crear contenedor de Wordpress

```

docker run -d --name server-wp -e WORDPRESS_DB_HOST=server-mysql -e WORDPRESS_DB_USER=user-wp -e WORDPRESS_DB_PASSWORD=12345 -e WORDPRESS_DB_NAME=courses --network net-wp --publish published=9300,target=80 wordpress

```