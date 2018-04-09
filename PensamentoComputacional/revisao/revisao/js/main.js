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