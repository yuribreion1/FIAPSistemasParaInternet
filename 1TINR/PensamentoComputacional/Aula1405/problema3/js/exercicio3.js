var nomes = [];
var idades = [];

for (let i = 1; i <= 5; i++) {
    var nome = prompt("Digite o nome: ");
    var idade = parseInt(prompt("Digite a idade"));
    nomes.push(nome);
    idades.push(idade);

    console.log(nomes);
    console.log(idades);
}

console.log('Primeiro nome inserido na lista: ' + nomes[0]);
console.log('Primeira idade inserida na lista: ' + idades[0]);
console.log("Nomes ordenados:\n" + nomes.sort());