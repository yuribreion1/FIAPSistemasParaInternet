<?php include("cabecalho.php");

// Função SetCookie, possui 3 parametros
// - Nome
// - Valor
// - Tempo de expiração

$nome = "NomeDoCookie";
$valor = 100;
$expira = time () + (60 * 60 * 24 * 7);

setcookie($nome, $valor, $expira);

if (isset($_COOKIE['Nome do cookie'])) {
    $nomeCookie = $_COOKIE['NomeDoCookieNovo'];
    echo $nomeCookie;
} else {
    echo "";
}

?>

<?php include("rodape.php"); ?>