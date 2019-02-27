## Aula 3 - 26/02/2019

Criamos um novo projeto:

- `jekyll new novo`

Criamos a pasta `_pessoas` na raiz do projeto e dois arquivos `markdown`, `pessoa1.md` e `pessoa2.md`:

- `mkdir _pessoas`

No arquivo `_config.yml` colocamos o atributo pessoas em `collections`: 

``` yml
collections: 
  - pessoas
```

Fazendo um restart com os comandos: 

- `jekyll b` e `jekyll s`

Criamos uma pasta `_data`, que neste caso não é uma coleção, é reconhecida direto pelo `framework`. Então não alteramos o `_config.yml`

- Criamos um arquivo chamado `alunos.yml` e colocamos o seguinte objeto:

  ``` yml
  - nome: Yuri Breion
  idade: 32;
  - nome: Ricardo 
    idade: 52;
  - nome: Bruno
    idade: 30;
  ```

Aprendemos também que as ferramentas de busca reconhecem o parametro `filetype` para listar somente itens com um tipo especifico de arquivo, como por exemplo:

  - `paises filetype csv`

- Criamos um arquivo agora chamado `paises.csv` dentro da pasta `_data` e criamos uma nova pagina para listar todos eles dentro de um ```<select>```. **Este caso não suporta arquivo _markdown_**, usar **html**