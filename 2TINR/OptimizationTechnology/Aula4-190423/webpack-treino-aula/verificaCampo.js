var constantes = require('./constantes.js');

function jogo() {
    var adivinhado = constantes.campo.value;

    if (adivinhado > constantes.sorteado) {
        UIkit.notification({
            message: 'É menor',
            status: 'danger',
            pos: 'bottom-center',
            timeout: 3000
        });
        constantes.campo.select();
    } else if (adivinhado < constantes.sorteado) {
        UIkit.notification({
            message: 'É maior',
            status: 'warning',
            pos: 'bottom-center',
            timeout: 3000
        });
        constantes.campo.select();
    } else if (adivinhado == constantes.sorteado) {
        UIkit.notification({
            message: 'Acertou',
            status: 'success',
            pos: 'bottom-center',
            timeout: 2000
        });
        UIkit.notification({
            message: 'Recarregando pagina em 3 segundos para próxima jogada',
            status: 'primary',
            pos: 'bottom-center',
            timeout: 1000
        });
        setTimeout(() => {
            document.location.reload(true);
        }, 3000);
    } else {
        console.log("Corrigir o código");
        
    }
}

function verificaCampo() {
    constantes.checar.addEventListener("click", jogo);
    constantes.campo.addEventListener("change", jogo);
}

module.exports = verificaCampo;