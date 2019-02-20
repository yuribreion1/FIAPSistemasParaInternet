## Aula 2 - 19/02/2019

### Teste de lógica criando um programa que calcula _fatorial_:

``` javascript
    function f() {
        var num = document.getElementById("numero").value;
        console.log(num);
        var p = num;
        for (let i = num - 1; i > 1; i--) {
            p *= i;
            
        }
        alert('Fatorial de ' + num + ' é igual a ' + p);
    }
```

### Alguns conteúdos que serão abordados: 

1.  Controle de fluxo
2.  Laços de repetição
3.  Funções
4.  Eventos
5.  DOM
6.  Array
7.  Objetos
8.  Prototype -> Herança
9   Design Patterns
10. ECMA6

### Um pouco sobre funções usadas em_array_:

-   `pop` - Tira do final
-   `push` - Coloca no final
-   `unshift` - Coloca no inicio
-   `shift` - Tira do inicio
-   `splice` - Remove e retorna, recebe o primeiro parametro onde começa e o segundo(opcional recebe quantos itens após a primeira remoção também devem ser removidos)