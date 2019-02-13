/* 

    Pedir ao usuário a digitação do seu sexo... Exibir se ele é menininho ou menininha.

*/

var sexo = prompt("Qual seu sexo\nDigite M para menininho ou F para menininha:");

if (sexo == 'M' || sexo == 'm') {
    document.write("E um menininho");
} else {
    document.write("E uma menininha");
}