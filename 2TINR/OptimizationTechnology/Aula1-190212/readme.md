## Aula 2 - Optimization Technology

1.  Criamos um arquivo simples `.html`

2.  Com o `javascript` podemos manipular e criar comportamentos da pagina que é conhecida como `document` no js. 

3.  Aprendemos que podemos manipular as tags do HTML como no caso do atributo `id` conforme exemplo abaixo: 

``` javascript
    var tela = document.getElementById("tela");
        for (let eixo = 0; eixo < 100; eixo++) {
            tela.innerHTML+='<circle cx="' + eixo * 20 + '"cy="200" r="5" fill="red"></circle>';
        }
```