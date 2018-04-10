/* 

    Pedir ao usuário digitar um número e informar:
    - O número digitado foi: ?
    - O sucessor do número é: ?
    - O antecessor do número é: ? - O dobro do número é: ?
    - A metade do número é: ?

*/

var numero = parseInt(prompt("Digite um numero:"));

var sucessor = numero + 1;
var antecessor = numero - 1;
var dobro = numero * 2;
var metade = numero / 2;


document.write("O numero digitado foi: " + numero);
document.write("<br>O antecessor do numero e: " + antecessor);
document.write("<br>O sucessor do numero e: " + sucessor);
document.write("<br>O dobro do numero e: " + dobro);
document.write("<br>A metade do numero e:  " + metade);