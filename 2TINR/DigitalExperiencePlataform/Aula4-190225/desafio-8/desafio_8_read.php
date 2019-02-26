<?php include("header.php") ?>
<?php 
    $conexao = mysqli_connect('localhost','root','','desafio');

    if (!$conexao) {
        echo "Houve um erro ao conectar";
    }

    $query = "SELECT * FROM desafio_8_usuarios";
    $resultado = mysqli_query($conexao, $query);
?>
    <?php

    while ($linha = mysqli_fetch_assoc($resultado)) {
    ?>
    <!-- Tag pré usada para identar o código -->
    <pre>
    <?php
        print_r($linha);
    }
    ?>
    </pre>
<?php include("footer.php") ?>