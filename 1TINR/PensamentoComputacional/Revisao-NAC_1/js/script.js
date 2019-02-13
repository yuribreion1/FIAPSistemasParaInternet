var nome = prompt('Informe seu nome!');





//Validação de nome
if (nome == '' || nome.length <= 4) {
	alert('Queira informar seu nome corretamente!');
}else{
	//Validação de idade
	var idade = parseInt(prompt('Informe sua idade!'));
	if (idade == '' ){
			alert('Queira informar sua idade!');
	}else{
		if (idade < 18 || idade > 80){
			alert('Acesso somente a pessoas entre 18 à 80 anos!');	
		}else{
			var estado = prompt('Informe seu estado!').toUpperCase();
			if (estado == '' || estado.length > 2) {
				alert('Queira informar seu estado corretamente!');
			}else if (estado =='SP'){
					var cidade = prompt('Informe sua cidade!');
					var seuTime = prompt('Informe seu time!');
			}else{
				alert('Estado não encontrado!');	
			}
		}

	}
}










console.log("Seu nome é:" + nome );
console.log("Sua idade é:" + idade );
console.log("Seu estado é:" + estado );
console.log("Seu cidade é:" + cidade );
console.log("Seu time é:" + seuTime );