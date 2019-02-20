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

-   [pop](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/pop) - Tira do final
-   [push](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/push) - Coloca no final
-   [unshift](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/unshift) - Coloca no inicio
-   [shift](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/shift) - Tira do inicio
-   [splice](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/slice) - Remove e retorna, recebe o primeiro parametro onde começa e o segundo(opcional recebe quantos itens após a primeira remoção também devem ser removidos)

### Trabalhando com objetos(JSON):

``` javascript
    var pessoa1 = {
        nome: "luizinho"
    }

    var pessoa2 = {
        nome: "zequinha"
    }

    var pessoa3 = { 
        nome: "lulu"
    }

    var carro1 = {
        placa: "abc-1234",
        tanque: 100,
        ligarCarro: () => {
            console.log('Ligando o carro de placa: ' + this.placa);
        },
        passageiros: [pessoa1, pessoa2, pessoa3]
    };

    console.log(JSON.stringfy(carro1));
```

Para acessar o mesmo escopo, usamos a expressão `this` que é usada para quem é dono, neste caso é o `Carro`: 

``` javascript
    Carro = (placa) => {
            this.placa = placa;
            this.ligado = false;
            this.liga = () => {
                if (this.ligado) {
                    console.log('Besta!');
                } else {
                    console.log('Vruuuummmm no carro ' + this.placa);
                    this.ligado = true;
                }
            }
            this.desliga = () => {
                if (!this.ligado) {
                    console.log('Besta!!');
                } else {
                console.log('pufffffs no carro ' + this.placa);
                this.ligado = false;
            }
        }
    }
```

Um outro exemplo pode ser usado para criar placas dinamicamente: 

``` javascript
    var estacionamento = {
        nome: "meu estacionamento",
        carros = []
    }

    for (let i = 0; i < 9999; i++) {
        estacionamento.carros.push(new Carro("abc" + i));
    }
    console.log("depois");
```