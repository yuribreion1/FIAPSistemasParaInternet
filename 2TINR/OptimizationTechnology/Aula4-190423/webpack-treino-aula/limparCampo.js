var constantes = require('./constantes.js');

function limparCampo() {
    constantes.reiniciar.addEventListener("click", function () {
        if (document.getElementById("campo").value == '' ) {
            UIkit.notification({
                message: 'Campo em branco, favor entrar com um valor',
                status: 'danger',
                pos: 'bottom-center',
                timeout: 2000
            });
        } else {
            document.getElementById("campo").value = '';
            console.log('Limpando campo');
            sorteado = parseInt(Math.random() * 100);

            UIkit.notification({
                message: 'Limpando campo...',
                status: 'primary',
                pos: 'bottom-center',
                timeout: 2000
            });
        }
        
    })
}

module.exports = limparCampo;