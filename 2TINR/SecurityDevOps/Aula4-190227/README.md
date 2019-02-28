## Aula 4 - 27/02/2019

### Boas práticas de desenvolvimento

-   **Agilidade** : Uso de multiplas camadas e plataformas mais granulares a fim de separar camadas como lógica de regras de negócio e interface de usuário ou mesmo funcionalidades dentro de uma interface.
-   **Mobilidade** : Aplicações capazes de serem implementadas em mais de um tipo de plataforma, prontas para o uso de _Cloud Computing_. 
-   **Funcionalidade** : Soluções baseadas em mobile ou interfaces web, que possam ser simplesmente acessadas a partir de um navegador web

#### Sistemas monolíticos

-   Um sistema composto por diversos modulos e que todos eles estão dentro de um único pacote, vários recursos juntos
    -   Exemplo: Sistema que processa _billing_, _notification_, _case management_. 

As novas empresas cada vez mais tem trabalhado em criar aplicações cada vez mais granularizadas, isso se aplica muito a aplicações _Cloud Native_ usando _Micro servicos_, onde temos várias aplicações onde cada uma tem a sua responsábilidade bem definida.

**Micro servicos**

![microservicos](https://nodexperts.com/blog/wp-content/uploads/2017/05/Mircroservice-Architecture.png)