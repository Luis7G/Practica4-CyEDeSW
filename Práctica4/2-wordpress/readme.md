# Wordpress

### Crear red net-wp

```
docker network create net-wp
```
Esto creará una red de tipo bridge, que es el tipo predeterminado de red de Docker. Una red bridge permite que los contenedores se comuniquen entre sí dentro de la misma máquina anfitriona.

### Para que persista la información es necesario conocer ¿en dónde mysql almacena la información?
MySQL almacena la información en el directorio /var/lib/mysql dentro del contenedor. Para que esta información persista incluso si el contenedor se elimina o se reinicia, es necesario montar un volumen o un enlace desde el host al contenedor. 
### ruta carpeta host: db
### Crear contenedor de MySQL en la red net-wp
```
docker run --name mysql-wp -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=wordpress -e MYSQL_USER=wpuser -e MYSQL_PASSWORD=wppass -v "/c/Users/joelg/OneDrive - Escuela Politécnica Nacional/Semesters/SextoSemestre/ConstruccionyEvolucionDeSoftware/Practicas/4.-Volumenes-En-Docker/ISWD633-GR1/Práctica4/2-wordpress/db:/var/lib/mysql" --network net-wp -d mysql:latest
```

### Para que persista la información es necesario conocer ¿en dónde wordpress almacena la información?
WordPress almacena la información en dos lugares: la base de datos MySQL y el directorio /var/www/html/ dentro del contenedor. El directorio wp-content contiene los archivos de los temas, los plugins y los medios que se usan en el sitio web. Para que esta información persista, también es necesario montar un volumen o un enlace desde el host al contenedor.

### ruta carpeta host: www
### Crear contenedor de Wordpress en la red net-wp
```
docker run --name wordpress-wp -e WORDPRESS_DB_HOST=mysql-wp -e WORDPRESS_DB_NAME=wordpress -e WORDPRESS_DB_USER=wpuser -e WORDPRESS_DB_PASSWORD=wppass -v "/c/Users/joelg/OneDrive - Escuela Politécnica Nacional/Semesters/SextoSemestre/ConstruccionyEvolucionDeSoftware/Practicas/4.-Volumenes-En-Docker/ISWD633-GR1/Práctica4/2-wordpress/www:/var/www/html" --network net-wp -p 80:80 -d wordpress:latest
```

![Instalacion exitosa de WordPress](/Práctica4/images-for-wordpress/install-worpress.png)
User: joul7
PD: kOW(6)7dwX1k8TW7DO

### Personalizar la apariencia de wordpress y agregar una entrada
Para personalizar la apariencia de WordPress y agregar una entrada, se debe  acceder al panel de administración de WordPress desde el navegador. Para ello, se abre la dirección http://localhost/wp-admin y se ingresa el nombre de usuario y la contraseña que se haya elegido durante la instalación de WordPress.

Una vez que se haya accedido al panel de administración, se puede personalizar la apariencia de WordPress desde el menú Apariencia. Allí se podrá cambiar el tema, los widgets, los menús y el personalizador. También se puede instalar nuevos temas y plugins desde el menú Plugins.

![Personalización de apariencia de una wordpress page](/Práctica4/images-for-wordpress/personalization-wordpress.png)

Para agregar una entrada, se debe ir al menú Entradas y hacer clic en Añadir nueva. Allí se podrá escribir el título, el contenido, las categorías, las etiquetas y la imagen destacada de la entrada. Cuando se esté listo, se hace clic en Publicar para que tu entrada sea visible en el sitio web.

![Agregar entrada en wordpress](/Práctica4/images-for-wordpress/entry-wordpress.png)
### Eliminar el contenedor y crearlo nuevamente, ¿qué ha sucedido?
Lo eliminamos con:
```
docker rm -f wordpress-wp
```

Si eliminas el contenedor de WordPress y lo creas nuevamente con el mismo comando, no perderás la información que hayas guardado en la base de datos o en el directorio wp-content, ya que estos datos están almacenados en los enlaces del host. Sin embargo, si eliminas el contenedor de MySQL, perderás la información de la base de datos, a menos que hayas hecho una copia de seguridad previamente.

