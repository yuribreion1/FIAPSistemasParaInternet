var nome = prompt("Digite o nome do vendedor:");
var qntCalcas = parseInt(prompt("Digite a quantidade de calcas vendidas:"));

var salario = 1000;
var comissao = 25;
var total = (qntCalcas * comissao) + salario;

document.write("Nome do vendedor:" + nome);
document.write("<br>Quantidade de pecas vendidas:" + qntCalcas);
document.write("<br>Salario total mais comissao: " + total.toFixed(2));