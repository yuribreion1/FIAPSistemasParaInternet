do {
    var sigla = prompt("Digite a sigla do estado").toUpperCase();

} while (sigla == null || sigla == "" || sigla.length > 2);

alert("O estado selecionado foi: " + sigla);
console.log("O estado escolhido foi: " + sigla);

switch (sigla) {
    case 'SP':
        document.write("Palmeiras<br>São Paulo<br>Corinthians<br>Santos");
        console.log("Palmeiras\nSão Paulo\nCorinthians\nSantos");
        break;

    case 'RJ':
        document.write("Flamengo<br>Botafogo<br>Vasco<br>Fluminense");
        console.log("Flamengo\nBotafogo\nVasco\nFluminense");
        break;

    case 'MG':
        document.write("Atlético Mineiro<br>Cruzeiro<br>América Mineiro<br>Caldense");
        console.log("Atlético Mineiro\nCruzeiro\nAmérica Mineiro\nCaldense");
        break;

    default:
        break;
}