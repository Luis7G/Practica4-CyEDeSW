### Usando una forma más semántica cuando se especifican puertos

```
docker run -d --name <nombre contenedor> --publish published=valor,target=valor <nombre imagen>:<tag> 

```

### Crear contenedor de Jenkins puertos contenedor: 8080 (interface web), 50000 jenkins/jenkins:alpine3.18-jdk11
```
docker run -d --name jenkins-server --publish published=8080,target=8080 --publish published=50000,target=50000 jenkins/jenkins:alpine3.18-jdk11
```

### Publicando todos los puertos

```

```



