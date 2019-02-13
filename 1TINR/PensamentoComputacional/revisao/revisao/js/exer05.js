/*

    Pedir um número ao usuário e verificar se é maior ou menor que 100, informar na tela a resposta.

*/

var numero = parseInt(prompt("Digite um numero"));

if (numero > 100) {
    document.write("Este numero e maior que 100!");
} else {
    document.write("Este numero e menor que 100!");
}