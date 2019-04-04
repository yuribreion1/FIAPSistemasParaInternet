### Aula 6

#### Processos 

- Executar aplicações que **não geram estado**, de forma que ela seja descartável e possa ser facilmente reutilizavel, o surgimento de micro-servicos cria este tipo de ambiente

![microservicos](https://s3-us-west-1.amazonaws.com/nearsoft-com-media/uploads/2017/04/the-microservices-approach-and-how-it-beats-monolithics-side-01-768x784.png)

#### Container

- Forma de compactar o ambiente em camadas(_layers_): 

![container](https://www.docker.com/sites/default/files/d8/styles/large/public/2018-11/container-what-is-container.png?itok=vle7kjDj)

<iframe width="555" height="313" src="https://www.youtube.com/embed/n-JwAM6XF88" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

- **Katacoda** é um exemplo de simulação para criação de container, podemos começar [aqui](https://www.katacoda.com/courses/docker)

- Para saber se o _docker_ tem algo usamos `docker ps`

- Para saber quais imagens estão instaladas, use o `docker images`

- Usamos o conceito de _imagem_ como se usa em virtualizaçào de sistemas operacionais, então a nível de aplicação temos a aplicação já pronta, com todas as suas dependencias. Para pesquisar imagens usamos o comando `docker search php`

- Para aplicar uma imagem usamos o comando `docker run mysql:8`, onde estamos instalando o _MySQL_ versão 8

- Uma vez instalado podemos executar em outro terminal o serviço _mysql_: `docker exec -ti <id> mysql -u root -p<pw>`

- Podemos alocar espaço(_volume_) `-v` para instalação, onde ficará armanezado os dados, trabalhando persistencia de dados
