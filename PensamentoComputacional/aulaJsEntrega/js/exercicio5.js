// Referencia extraida: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/sort
// var scores = [1, 10, 2, 21]; 
// scores.sort(); // [1, 10, 2, 21]
// Observe que 10 vem antes do 2,
// porque '10' vem antes de '2' em ponto de código Unicode.

function verifica() {

    const num1 = parseInt(document.getElementById("numero1").value);
    const num2 = parseInt(document.getElementById("numero2").value);
    const num3 = parseInt(document.getElementById("numero3").value);
    const numbers = [num1, num2, num3];

    if (num1 == num2 && num1 == num3) {
        if (num2 == num1 && num2 == num3) {
            if (num3 == num1 && num3 == num2) {
                alert('Os números ' + num1 + ' , ' + num2 + ' , ' + num3 + ' são iguais');
            }
        }
    } else {
        numbers.sort(function(a, b) {
            return a - b;
          });
          alert('Números ordenados ' + numbers);
    }

}

function compararNumeros(a, b) {
    return a - b;
  }