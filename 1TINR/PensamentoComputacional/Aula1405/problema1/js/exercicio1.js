    do {
        sexo = prompt("Digite o seu sexo:\nM para homem\nF para mulher").toUpperCase();
    } while(sexo.length > 1 || sexo == '' || sexo == null || sexo == ' ') {
        if (sexo == 'M') {
            console.log('Menininho');
            document.write('<strong>Menininho</strong>');
        } else if (sexo == 'F'){
            console.log('Menininha');
            document.write('<strong>Menininha</strong>');
        } else {
            console.log('Sexo informado incorretamente');
            document.write('Sexo informado incorretamente!!');
        }
    }