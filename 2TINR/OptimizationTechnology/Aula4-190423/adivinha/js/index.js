var sorteado = parseInt(Math.random() * 100);
const checar = document.getElementById("checar");
const campo = document.getElementById("campo");
const reiniciar = document.getElementById("reiniciar");

console.log('O número sorteado foi: ' + sorteado);

function verificaCampo() {
    checar.addEventListener("click", function () {
        var adivinhado = campo.value;

        if (adivinhado > sorteado) {
            UIkit.notification({
                message: 'É menor',
                status: 'danger',
                pos: 'bottom-center',
                timeout: 3000
            });
        } else if (adivinhado < sorteado) {
            UIkit.notification({
                message: 'É maior',
                status: 'warning',
                pos: 'bottom-center',
                timeout: 3000
            });
        } else if (adivinhado == sorteado) {
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
    })
}

function limparCampo() {
    reiniciar.addEventListener("click", function () {
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

if (campo.key == "Enter") {
    verificaCampo();
}

verificaCampo();
limparCampo();
