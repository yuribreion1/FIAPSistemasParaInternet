function verifica() {
    const num1 = document.getElementById("numero1").value;
    const num2 = document.getElementById("numero2").value;
    const soma = parseInt(num1) + parseInt(num2);
    
    if (soma >= 18) {
        alert('O valor é maior ou igual a 18, soma do valor inserido: ' + soma);
    } else {
        alert('O valor é menor a 18, soma do valor inserido: ' + soma);
    }
    
    
}