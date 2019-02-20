var estacionamento = {
    nome: "meu estacionamento",
    carros = []
}

for (let i = 0; i < 9999; i++) {
    estacionamento.carros.push(new Carro("abc" + i));
}
console.log("depois");