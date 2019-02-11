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
        function somar($x, $y) {
            return $x + $y;
        }

        function subtrair($x, $y) {
            return $x - $y;
        }

        function multiplicar($x, $y) {
            return $x * $y;
        }

        function dividir($x, $y) {
            return $x / $y;
        }

        echo "Soma: " . somar(10,15) . "<br>";
        echo "Subtração: " . subtrair(10,15) . "<br>";
        echo "Multiplicação: " . multiplicar(10,15) . "<br>";
        echo "Divisão: " . dividir(10,15);
    ?>
</body>
</html>