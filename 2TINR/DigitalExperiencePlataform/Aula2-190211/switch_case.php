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
    $numero = 40;
    
    switch ($numero) {
        case 34:
            echo "Esse é o 34";
            break;
        case 37:
            echo "Esse é o 37";
            break;
        case 35:
            echo "Esse é o 35";
            break;
        case 40:
            echo "Esse enfim é o 40!";
        default:
            echo "<br>Fim do programa";
            break;
    }
    ?>
</body>
</html>
