## Aula 7 - 10/04/2019 - Docker

Uma vez que temos uma noção melhor de como criar um container, podemos colocar instruções para definir um servidor de aplicação e subir um serviço, no caso simples, uma pagina estática

- Usamos o _dockerfile_ onde todos estes parametros devem ser definidos
- começamos com o `FROM` onde passamos o servidor que hospeda o conteúdo:

``` docker
FROM nginx:1.11-alpine
```

- Depois disso definimos onde o arquivo deve ser inserido dentro do servidor de aplicação:

``` docker
COPY index.html /usr/share/nginx/html/index.html
```

- Por fim, publicamos ele numa porta _http_ que no caso é a 80:

``` docker
EXPOSE 80
```

- Executamos as instruções definidas no arquivo _dockerfile_

``` bash
docker run -d -p 80:80 webserver:v1
```

- Para verificar o processo criado:

``` bash
docker images
```

- Para acessar o resultado usamos: 

``` bash
curl docker
```

