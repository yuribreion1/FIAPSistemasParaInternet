/*

Parte 1

var empresa = "Fiap Tecnologia";
var numero = 1000;

console.log("Nome da empresa => " + empresa); //Imprimindo variavel
console.log("Do tipo => " + typeof empresa); //Obtendo tipo da variavel
console.log("Construtor => " + empresa.constructor); //Obtendo seu construtor
console.log("Comprimento => " + empresa.length); //Obtendo a quantidade a largura da variavel
console.log("Posicao de caracter => " + empresa.indexOf("i"));  //Posicao do caracter
console.log("Caracter da posicao => " + empresa.charAt(2)); //Retorna o caracter recebendo a posicao
console.log("Obtendo parte do caracter => " + empresa.substr(2, 4)); //Pega caracter da posicao 2 com 4 caracter
console.log("Alterando uma palavra por outra => " + empresa.replace("Tecnologia","Escola")); //Trocando uma palavra por outra
console.log("Aplicando dois digitos depois => " + numero.toFixed(2)); //Aplicando dois digitos depois da virgula

*/

/* Exercicio 1 */ 

/*
    Vamos implementar o código que irá gerar uma String nesse formato a partir de um número.
    Primeiramente vamos criar uma variável do tipo Number que será formatada.
    Nosso código deve resultar na string “R$ 9,90”. Logo, será necessário converter para string com duas casas decimais, 
    adicionar “R$ ” ao início e substituir o ponto e virgula.

var numero = 9.9;
var numeroFormatado = numero.toFixed(2);
var valor = "R$ " + numeroFormatado;
valor = valor.replace(".",",");
console.log(valor);

*/

/*

    Assim como é necessário formatar para mostrar ao
    usuário, também é comum precisarmos fazer o processo inverso, ou seja a partir de uma string formatada 
    teremos que extrair o número.
    Portanto, vamos iniciar declarando uma variável do tipo String. Ex. 155,89

*/

var valor = "R$ 155,89";
var valorExtraido = valor.replace("R$ ","");
valorExtraido = valorExtraido.replace(",",".");
var numero = parseFloat(valorExtraido);
console.log(numero + typeof(numero));