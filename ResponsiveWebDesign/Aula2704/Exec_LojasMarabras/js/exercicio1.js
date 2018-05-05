var valor1 = parseInt(prompt("Digite o primeiro valor:"))
var valor2 = parseInt(prompt("Digite o segundo valor"));

function calculaValores() {

    if (isNaN(valor1) || isNaN(valor2)) {
        alert("Favor digitar um valor numerico");
        //Recarregar a pagina se entrar no IF
        
        timeout = 2000;
        setTimeout(() => {
            window.location.reload();
        }, timeout);
    }

    var soma = valor1 + valor2;
    var subtracao = valor1 - valor2;
    var divisao = valor1 / valor2;
    var multiplicacao = valor1 * valor2;
    console.log("Soma: " + soma + "\nSubtracao: " + subtracao + "\nDivisao: " + divisao + "\nMultiplicacao: " + multiplicacao);
}

console.log(calculaValores());