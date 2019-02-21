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
    
**Descrição do Problema (Perspectiva do Usuário da Plataforma)**:

Vamos começar com o fluxo de informações:
Nosso sistema financeiro obtém dados de folha de pagamento de todas as nossas várias divisões de diferentes maneiras. Nós acumulamos todos os números de horas trabalhadas e de hora em hora atualizamos esses dados, que incluem salários e impostos. Parece fácil, mas é extremamente complexo, porque cada estado tem diferentes tabelas de impostos, leis trabalhistas e assim por diante.
Para garantir que algo não estrague tudo, garantimos que os números resumidos correspondam aos números detalhados de cada divisão.
É um processo muito desajeitado e manual. Ele funciona na maior parte do tempo, mas ontem descobrimos que o upload dos dados não foi concluído. Todos os horários estavam preenchidos com zeros na relação entre horas trabalhadas e valor devido.
Isso nunca aconteceu antes. Não tenho ideia do que poderia ter causado o problema nenhuma mudança importante foi programada para esse período de pagamento;

**Hipótese 1: Falha na infraestrutura física**:

Falha na plataforma de storage da empresa, essa plataforma é responsável por manter os dados que estão sendo consumidos pelo sistema de folha de pagamentos, no momento está sendo executado um "warroom" entre fornecedor e time de storage, este sistema fornece armazenamento centralizado para muitos sistemas mais críticos da empresa, até agora o único sistema afetado é o sistema de pagamento.

**Hipótese 2: Atualização de S.O. nos servidores de pagamento**:

Uma atualização de sistema operacional foi executada fora de horário, (ou seja, em janela) nos servidores do sistema de pagamento. Demorou mais do que esperado e quando o sistema foi reiniciado alguns testes começaram a falhar (todos de software, não existe testes de infraestrutura, pois estes são executados manualmente), sendo normalizados dentro de quinze minutos, aparentemente o sistema voltou a operar conforme esperado.

**Hipótese 3: Release liberada pelo time de desenvolvimento**:

Patch de alteração na plataforma, a equipe de desenvolvimento entregou uma nova feature em
um dos sistemas de apoio ao sistema de pagamento, a entrega foi agendada via CAB* e entregue
pelo time de desenvolvimento diretamente no sistema em produção um dia antes da falha no
sistema de processamento de pagamentos;

_CAB_: Commit Advisory Border - Essencialmente o que chamamos de comitês de aprovação de mudanças;

**Hipótese 4: Mitigação aplicada pelo time de segurança**:

Instalação de um patch de segurança, a instalação ocorreu na noite que antecedeu o primeiro report de falha, o time responsável entregou a atualização sem passar pelo processo de CAB segundo orientações de seu próprio coordenador devido a criticidade e urgência da operação, a alteração consistiu em implementar um token para omitir campos considerados sigilosos e relatados como vulneráveis após um relatório de auditoria.

[Postagem do formuário](https://pt.surveymonkey.com/r/J283Q78) 