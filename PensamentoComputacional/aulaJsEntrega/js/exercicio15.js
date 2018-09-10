var valor = parseInt(prompt('Quantos números você deseja receber: '));
var pares = 0;
var impares = 0;

for (let i = 1; i <= valor; i++) {
    var numero = parseInt(prompt('Digite um número: '));
    if (numero % 2 == 0) {
        alert('Número ' + numero + ' é par');
        pares += numero;
    } else {
        alert('Número ' + numero + ' é impar');
        impares += numero;
    }
}

alert('Soma de pares: ' + pares);
alert('Soma de impares: ' + impares);