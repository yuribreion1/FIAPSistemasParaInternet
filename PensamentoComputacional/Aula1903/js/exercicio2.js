var valor = "R$ 9,90";
var numero = valor.replace("R$","").replace(",",".");
var convert = parseFloat(numero);
console.log(convert.toFixed(2));
console.log(typeof convert);

/* 
    Operadores de comparação 

    == Operador de igualdade
    != Operador de diferença
    === Comparação de operador Ex. numeros vs. string
    !== Comparação de operador igual e do mesmo tipo
*/ 

var a = 3;
var b = 5;

if (a !== b) {
    console.log("Verdadeiro");
} else {
    console.log("Falso");
}
