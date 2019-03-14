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

### Verificando o status de seus arquivos

- Usamos o comando `git status` para saber o status atual do nosso repositório, segue um exemplo: 

``` git
$ git status
# On branch master
nothing to commit, working directory clean
```

- Segue um exemplo de arquivos que não foram ainda `_commitados_`:

``` git
$ vim README
$ git status
# On branch master
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#    README
nothing added to commit but untracked files present (use "git add" to track)
```

### Adicionando novos arquivos

- Através do comando `git add <nome do arquivo>` podemos registrar este arquivo para ser `_commitado_` 

``` git
$ git add README
```

- A partir de agora este arquivo `README` estará como _tracked_ e pronto para o _commit_

### Analisando mudanças nos arquivos adicionados e não

- Para ver o que você alterou mas ainda não selecionou, digite o comando `git diff` sem nenhum argumento

``` git 
$ git diff
diff --git a/benchmarks.rb b/benchmarks.rb
index 3cb747f..da65585 100644
--- a/benchmarks.rb
+++ b/benchmarks.rb
@@ -36,6 +36,10 @@ def main
           @commit.parents[0].parents[0].parents[0]
         end

+        run_code(x, 'commits 1') do
+          git.commits.size
+        end
+
         run_code(x, 'commits 2') do
           log = git.commits('master', 15)
           log.size
```

- Isto compara o que esta no seu diretório e o que esta na área de seleção

- Para verificar as mudanças que você já adicionou e que serão _commitadas_ use: `git diff --cached`

### Fazendo _commit_ das suas mudanças

- Uma vez que você adicionou arquivos e estão em _tracked_, você esta apto para _commitar_: 

`$ git commit -m "Story 182: Fix benchmarks for speed"`

- Segue o resultado abaixo:

``` git
$ git commit -m "Story 182: Fix benchmarks for speed"
[master]: created 463dc4f: "Fix benchmarks for speed"
 2 files changed, 3 insertions(+), 0 deletions(-)
 create mode 100644 README
```

### Históricos dos _commits_

- Trabalhando em um repositório com vários _commits_ e outros desenvolvedores é importante saber o que esta acontecendo tanto localmente como remotamente, para isto usamos o `git log`

``` git
$ git log
commit ca82a6dff817ec66f44342007202690a93763949
Author: Scott Chacon <schacon@gee-mail.com>
Date:   Mon Mar 17 21:52:11 2008 -0700

    changed the verison number

commit 085bb3bcb608e1e8451d4b2432f8ecbe6306e7e7
Author: Scott Chacon <schacon@gee-mail.com>
Date:   Sat Mar 15 16:40:33 2008 -0700

    removed unnecessary test code

commit a11bef06a3f659402fe7563abf99ad00de2209e6
Author: Scott Chacon <schacon@gee-mail.com>
Date:   Sat Mar 15 10:31:28 2008 -0700

    first commit
```



