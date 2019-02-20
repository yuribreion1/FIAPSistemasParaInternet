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