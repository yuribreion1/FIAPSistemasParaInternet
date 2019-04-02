<?php 
    function calculaPercs($total, $brancos, $nulos, $validos) {
        $total = $_POST['total'];
        $brancos = $_POST['brancos'];
        $nulos = $_POST['nulos'];
        $validos = $_POST['validos'];

        $perc_brancos = ($brancos / $total) * 100;
        $perc_nulos = ($nulos / $total) * 100;
        $perc_validos = ($validos / $total) * 100;
        $array = [$perc_brancos, $perc_nulos, $perc_validos];
        return $array;
    }

    $votos = calculaPercs(1000, 300, 500, 200);
    foreach ($votos as $v) {
        echo $v . " ";
    }
?>