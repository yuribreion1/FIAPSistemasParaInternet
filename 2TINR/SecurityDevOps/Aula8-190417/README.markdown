## Micro serviços x Container

[Material da aula](http://secdevops.herokuapp.com/#101)

-   _Microserviços_ - Uma abordagem para desenvolvimento de aplicações

    ![microservicos](https://www.luiztools.com.br/wp-content/uploads/2018/05/consulta-de-lancamentos.png
    )
-   _Docker_ - Uma solução para entrega de microserviços

    ![docker](https://www.docker.com/sites/default/files/d8/styles/large/public/2018-11/container-what-is-container.png?itok=vle7kjDj)

## Orquestração de container

-   Aplicações _stateless_
    -   Nada em disco
    -   Frond end web
    -   Pode parar e iniciar com vários containers
    -   Sem instancias de configuração

-   Aplicações _stateful_
    -   Quando precisamos guardar informações de alguma forma(senhas, _endpoints_)

> Aplicar o conceito de _container_ a uma aplicação não é uma solução ideal

Quando temos muitos containers para serem executados. Uma boa solução seria utilizar o [docker compose](https://docs.docker.com/compose/) que permite editar o processo de _deploy_ de forma mais programatica

![docker compose](https://i2.wp.com/foxutech.com/wp-content/uploads/2017/06/Docker-compose-File.png?fit=1000%2C390&ssl=1)

[Questões valendo nota](https://pt.surveymonkey.com/r/YPV973T)