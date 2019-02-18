<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PHP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<!-- Crie uma função que sorteia os números da Mega Sena.
    Exiba em ordem crescente como no exemplo. -->
    <?php 
        $numeros = array(26, 34, 37, 51, 55, 59);

        function sorteio() {
                echo "<br>Sorteio automático de números: <br>";
            
            for ($numero=0; $numero < 5; $numero++) { 
                echo " Número: " . rand(1, 60) . "<br>";
            }
        }

        echo "Os números sorteados da Mega Sena são: " . implode(",",$numeros) . "<br>";
        echo sorteio();

    ?>
</body>
</html>
