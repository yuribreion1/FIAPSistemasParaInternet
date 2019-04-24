function digaOi(nome) {
    alert("Olá "+ nome + " !!!");
}

function digaTchau(nome) {
    alert("Tchau " + nome + "!!!");
}

var funcoes = {
    funcDigaOi: digaOi,
    funcDigaTchau: digaTchau
}

// Exportando a função para ser chamada 
module.exports = funcoes