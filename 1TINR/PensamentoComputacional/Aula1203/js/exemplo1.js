alert("Mostra todo o conteúdo para o usuário");

//Criando variavel
var empresa = "Fiap Tecnologia";
console.log("Minha empresa => " + empresa);
console.log("Do tipo: " + typeof empresa);
console.log("Contrutor => " + empresa.constructor);

//Criando objeto
var curso = new String("JavaString");
console.log("Meu curso => " + curso);
console.log("Do tipo => " + typeof curso);
console.log("Construtor => " + curso.constructor);

//Exibe a quantidade de caracteres tem a variavel
console.log(empresa.length);

//Começando do 0, retorna o caracter da posição 5
console.log(empresa.charAt(5));

//Começando da posição 0, a posição onde começa a parte procurada
console.log(empresa.indexOf("Tecno"));

//Extrai uma quantidade de caracteres
console.log(empresa.substr(5, 6));

//Substitui a parte "Tecnologia" por "Digital"
console.log(empresa.replace("Tecnologia", "Digital"));

var textoInteiro = "20";
console.log(typeof textoInteiro);

//Conversão
var inteiro = parseInt(textoInteiro, 10);
console.log(typeof inteiro);

var textoFloat = "10.22";
console.log(typeof textoFloat);

var floats = parseFloat(textoFloat);
console.log(typeof floats);

var milNumber = 1000;

//Aplicando duas casas decimais
var milString = milNumber.toFixed(2);
console.log(milString);

var tipo = true;
console.log(typeof tipo);

var tipo2 = new Boolean(false);
console.log(tipo.valueOf());
console.log(tipo2.toString());

var idade = 10;
var idade2 = 30;

console.log(idade + idade2);
console.log(idade * 2);

var exercicio1 = "9.90";
var valorFloat = parseFloat(exercicio1);
var valorFinal = "R$" + valorFloat;
console.log(valorFinal);

