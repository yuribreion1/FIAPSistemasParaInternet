<?php include("cabecalho.php");

if (isset($_COOKIE['cookie_teste'])) {
    echo "Você já passou aqui";
} else {
    echo "Você nunca passou aqui";
    setcookie('cookie_teste','Algum valor...',time () + (60 * 60 * 24 * 7));
}

?>

<?php include("rodape.php"); ?> 