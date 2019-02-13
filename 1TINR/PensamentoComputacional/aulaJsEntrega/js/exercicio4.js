function verifica() {
    const num1 = parseInt(document.getElementById("numero1").value);
    const num2 = parseInt(document.getElementById("numero2").value);

    if (num1 == num2) {
        alert(num1 + ' é igual a ' + num2);
    } else if (num1 > num2) {
        alert('Número ' + num1 + ' é maior que ' + num2);
    } else {
        alert('Número ' + num2 + ' é maior que ' + num1);
    }
}