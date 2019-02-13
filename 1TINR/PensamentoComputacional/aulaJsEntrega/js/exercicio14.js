var salarios = 0;

var qntFuncionarios = parseInt(prompt('Digite a quantidade de funcionários que há na empresa: '));

for (let i = 1; i <= qntFuncionarios; i++) {
    var salario = parseInt(prompt('Digite o salário do empregado'));
    salarios += salario;
}

alert('Total dos salários: ' + salarios);