var salarios = 0;

for (let i = 1; i <= 5; i++) {
    var salario = parseInt(prompt('Digite o salário do empregado'));
    salarios += salario;
}
alert('A média dos salários é ' + (salarios / 5));
