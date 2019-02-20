## Aula 3 - 19/02/2019

### Vamos iniciar um novo projeto em Jekyll

-   Foi usado o nome de manufatura 3D usando o comando `jekyll new manufatura3d`
-   Vamos subir o servidor usando o comando `jekyll s` e subir corretamente o site

Alteramos o titulo da pagina no arquivo `_config.yml`

``` yml
title: Manufatura 3D
email: meu-email@example.com
```

Ainda dentro do `_config.yml` criamos um atributo chamado `collections` passando o valor `pessoas`, isso faz com que você possa ter uma pasta chamada `_pessoas` no seu projeto

Já no arquivo de `index.md` criamos um for para passar por todas os arquivos da pasta `_pessoas` estamos pegando o valor da variavel pessoa e imprimindo sempre com _mustache_ `{{ }} `

``` liquid
    {% for pessoa in site.pessoas %}
    <div>{{ pessoa.content }}</div>
    {% endfor %}
```

As paginas criadas dentro de pessoas podem ter suas paginas separadas definindo o valor `true` para `output:` no arquivo `_config.yml` como esta abaixo:

``` liquid
collections: 
  pessoas: 
    output: true
```



