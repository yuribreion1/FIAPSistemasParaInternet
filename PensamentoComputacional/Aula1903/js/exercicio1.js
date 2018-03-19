/* Primeira versão
console.log("Primeira versão");
var numero = 9.9;
var formato = numero.toFixed(2);
console.log("Tipo da variavel numero: " + typeof numero);

formato = "R$" + formato;

//Trocando ponto por virgula
formato = formato.replace(".",",")
console.log(formato);

*/

/* Segunda versão */
var numero = 9.9;
var formato = "R$" + numero.toFixed(2).replace(".",",");
console.log(formato);