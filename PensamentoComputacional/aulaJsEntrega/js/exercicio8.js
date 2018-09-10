function verifica() {
    const num1 = document.getElementById("numero1").value;

    if ((num1 % 2) == 0) {
        alert('Numero ' + num1 + ' é par');
    } else {
        alert('Numero ' + num1 + ' é impar');
    }
}