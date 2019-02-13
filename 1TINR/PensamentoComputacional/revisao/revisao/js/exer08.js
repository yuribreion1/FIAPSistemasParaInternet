/* 

    Pedir um número e informar se ele é par ou ímpar 

*/

var numero = parseInt(prompt("Digite um numero:"));

if (numero % 2 == 0) {
    document.write("Numero e par");
} else {
    document.write("Numero e impar");
}