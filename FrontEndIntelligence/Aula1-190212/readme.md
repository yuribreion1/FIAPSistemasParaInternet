## Aula 2 - Front End Intelligence

1.  O professor passou os passos para instalação do `Jekyll` nos equipamentos, para instalação. Mais detalhes [aqui](https://jekyllrb.com/).

2.  Para subir o `Jekyll` na sua maquina, usamos o comando `bundle exec jekyll serve`

3.  Iniciamos nossa primeira postagem a ser feita dentro da pasta `_posts`

4.  Após as alterações da sua pagina temos que _buildar_ nossa pagina usando `jekyll build` no terminal e por fim `jekyll serve` para disponibilizar a pagina no `localhost`

5.  O `Jekyll` também suporta a linguagem _Markdown_, então podemos criar uma postagem dessa forma como o exemplo abaixo:

``` markdown
---
layout: page
title: Pagina de teste usando Markdown
---

function teste(a, b) {
    return a + b;
} 
console.log(teste(3, 5));

```

6.  Podemos chamar automaticamente um tema do `Jekyll` usando uma marcação especifica da linguagem `liquid`: 

``` markdown
---
layout: page
title: titulo da pagina
```
### Criando pagina estatica para subir no [Github.io](https://pages.github.com/)