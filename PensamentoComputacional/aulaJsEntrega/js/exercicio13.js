var salarios = 0;

for (let i = 1; i <= 5; i++) {
    var salario = parseInt(prompt('Digite o salário do empregado'));
    salarios += salario;
}

var media = (salarios / 5);

alert('A média dos salários é ' + media);

if (media <= 5000) {
    alert('Rever os salários desses profissionais');
} else {
    alert('O salário desses funcionários estão corretos');
}
