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
        //Potencia
        echo pow(2, 5) . "<br>";
        //Raiz quadrada
        echo sqrt(100) . "<br>";
        //Gera numeros aleatorios, neste caso de 1 a 100
        echo rand(1, 100);

        $lista = [3, 54, 6565, 89, 54, 12, 5];

        //Exibe o maior número
        max($lista);

        //Exibe o menor número
        min($lista);

        //Ordena de forma crescente
        sort($lista);
    ?>
</body>
</html>