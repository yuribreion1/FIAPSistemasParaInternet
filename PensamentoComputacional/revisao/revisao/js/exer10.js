/* 

    Informar uma temperatura em Celsius e apresentar o resultado em Fahrenheit

*/

var temp = parseInt(prompt("Digite a temperatura em Celsius:"));
var tempFar = (((9/5) * temp) + 32);
document.write("A temperatura em Farheint:" + tempFar);