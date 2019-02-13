<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PHP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <?php 

    //Desafio 1 - Usar o echo uma unica vez
    
        $nome = "Yuri";
        $sobrenome = "Breion";
        $ano = "2019";
        $curso = "Sistemas para Internet";
        $faculdade = "FIAP";

        echo "<h1>$nome $sobrenome<br>$curso $ano<br>$faculdade</h1>";
        //Versão do professor
        //echo $nome . " " . $sobrenome . "<br>" . $curso . " " . $ano . "<br>" . $faculdade;
    ?>
</body>
</html>