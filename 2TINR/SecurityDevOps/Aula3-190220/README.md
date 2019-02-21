## Aula 3 - 20/02/2019

### Gestão e boas praticas operacionais

-   Se aplica o termo **_IAC_**(_Infrastructure as a code_)
    Desenvolver e configurar a infraestrutura através de código e ferramentas de automação de forma que a arquitetura possa ser versionada.
    Esta abordagem ajuda e aumenta a velocidade do _deploy_ e melhora o processo de escalabilidade. Esta prática possui duas caracteristicas: 
    1.  **Computação em nuvem**: Arquitetura escalavel onde é possível criar servidores e alocar recursos de forma dinâmica.

    2.  **Automação e orquestração de ambientes**: Ferramentas para manipulação de recursos como _cloud computing_ e virtualização.

        2.1 **Orquestração**: 
            Criar instancias;
            Rede;
            Armazenamento; 

        2.2 **Automação**:
            Configuração de ambiente;
            Gerenciamento;

-   Exemplos de _Plataform as a Service(PAAS)_
    -   [Heroku](https://signup.heroku.com/?c=70130000000NcJNAA0)
    -   [Openshift](https://www.openshift.com/)

-   Saindo um pouco do conceito de _ops_ em _dev_ temos que saber a respeito das ações do desenvolvedor. O [12factor](https://12factor.net/) foi criado para definir alguns padrões que permitam que aplicações sejam feitas voltadas a facil aplicação para nuvem, que recebe o termo de _cloud native_.
Exite o termo _anti-patterns_ que são aplicações que não conseguem ser aplicados ao ambiente de nuvem. Pode se considera um mau uso, que inviabiliza o uso dela de outra forma a não ser como ela já foi desenvolvida.