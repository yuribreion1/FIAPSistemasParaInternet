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

### Desafio em sala:

O trecho que segue é uma adpatação de um cenário descrito no Livro "The Phoenix Project";
    1.  Leia atentamente o cenário descrito;
    2.  Discuta a situação descvrita entre os componentes do grupo;
    3.  Com base nas 4 hipóteses escolha aquela que na opinião do grupo melhor descreve       uma possível causa raiz para o problema;
    4.  Adicione a resposta no questionário enviado para análise e comparação do que        fora definido como causa por cada grupo;

**Primeiro contato (como a falha foi relatada)**:
    
    From: Dick Landry 
    To: Steve Masters
    Date: September 4, 8:27 AM
    Priority: Highest
    Subject: Sistema de pagamentos indisponível
        Oi, Steve.
        Nós estamos enfrentando uma séria falha no funcionamento do sistema de pagamentos
        ainda estamos avaliando o problema, aparentemente algo com os números exibidos no sistema atualmente que segundo o pessoal do financeiro estão "inconsistentes" consequentemente centenas de colaboradores possuem ordens de pagamentos represadas o que impede o cálculo do que deve ser pago à quem e quando, com isso estamos correndo o risco de não termos nossos colaboradores sendo pagos, precisamos corrigir isso até a próxima sexta feira, dia 05 antes que a janela de pagamentos feche.
        ATT

**Descrição do Problema (Perspectiva do especialista do coordenador de RH)**:
Na execução do programa de ERP responsável pela geração da folha de pagamento ontem, todos os registros dos funcionários referentes a horas trabalhadas desapareceram. Temos certeza de que é um problema de TI. Essa confusão está nos impedindo de pagar nossos funcionários, violando inúmeras leis trabalhistas estaduais".
    