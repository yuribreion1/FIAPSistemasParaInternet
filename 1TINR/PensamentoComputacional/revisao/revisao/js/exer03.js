/* 
    Pedir 4 notas e calcular a média do aluno!

*/

var nota1 = parseInt(prompt("Digitar a primeira nota:"));
var nota2 = parseInt(prompt("Digitar a segunda nota:"));
var nota3 = parseInt(prompt("Digitar a terceira nota:"));
var nota4 = parseInt(prompt("Digitar a quarta nota:"));

var media = (nota1 + nota2 + nota3 + nota4) / 4;
alert("Sua média é de: " + media);