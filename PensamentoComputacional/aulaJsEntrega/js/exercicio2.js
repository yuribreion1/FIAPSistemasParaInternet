do {
    var nome1 = prompt('Entre com o nome da primeira pessoa:');
    var idade1 = prompt('Digite a idade da primeira pessoa');
    var nome2 = prompt('Entre com o nome da segunda pessoa:');
    var idade2 = prompt('Digite a idade da segunda pessoa');
} while (idade1 == idade2);

if (parseInt(idade1) > parseInt(idade2)) {
    alert(nome1 + ' é maior de idade');
} else {
    alert(nome2 + ' é maior de idade');
}