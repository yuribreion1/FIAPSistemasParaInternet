## Aula 5 - Git e [Github](https://github.com/)

- O git nos ajuda para controle de versões de código e otimiza o trabalho em equipe para o time de desenvolvimento e projetos de Software

- Podemos instalar o Git na maquina pelo [Git-SCM](https://git-scm.com)
    Agora que temos o Git instalado, podemos trabalhar com versões, e é muito legal aprender isto usando o `terminal` ou `cmd`

### Criando sua identidade

- Temos que definir nossas credenciais(usuário e e-mail da conta) no terminal que estamos trabalhando:

*Usuário*: `$ git config --global user.name "Yuri Breion"`

*E-mail*: `$ git config --global user.email yuri@yuri-producoes.com`

- Para verificar suas configurações você pode usar o comando `$ git config --list`

### Pedindo ajuda

- Você pode pedir ajuda a determinado comando do git `$ git help <verb>`

### Inicializando um novo repositório localmente

- Supondo que você tenha uma pasta com um projeto de software qualquer, e você deseja iniciar o git nela, basta você digitar no terminal: `git init` que cria um subdiretório `.git`

- Caso você já tenha arquivos nesta pasta eles estarão como `untracked` ou não rastreados dentro do git, agora é o momento de `_commitar_` seu código

### Clonando um repositório existente

- Caso você precise baixar um projeto que já esteja no Git para a sua maquina, usamos a função `git clone`, segue um exemplo: `$ git clone git://github.com/schacon/grit.git`

Após clonar este caso, uma pasta com o mesmo nome será criada, caso você queira uma pasta com outro nome pode usar o nome da pasta que desejar em seguida: `$ git clone git://github.com/schacon/grit.git <novo-nome>`

### Ciclo de vida das atualizações

![ciclodevida](https://git-scm.com/figures/18333fig0201-tn.png)