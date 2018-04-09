/* 

    Pedir um número e mostrar o seu sucessor e o seu antecessor!

*/ 

var entrada = parseInt(prompt("Digite um número:"));
console.log(typeof(entrada));
var sucessor = entrada + 1;
var antecessor = entrada - 1;

alert("Seu antecessor é: " + antecessor);
alert("Seu sucessor é: " + sucessor);
