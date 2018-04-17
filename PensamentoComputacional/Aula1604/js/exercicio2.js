var listaFrutas = ["Banana", "Maça", "Kiwi", "Abacate", "Limão"];

//For simples
for (numero = 1; numero <= 10; numero++) {
    console.log("Numero atual: " + numero);
}

//For in, ele itera e agrega o valor na constante sacola
for (const sacola in listaFrutas) {
   console.log(listaFrutas[sacola]);
}

