<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Variavel - Local ou Global</title>
</head>
<body>
    <?php 
        $variavel_externa = "fora";

        function teste() {

            // Termo global altera o escopo da variavel
            global $variavel_externa;

            $variavel_externa = "dentro";
            $variavel_interna = "local";
        }

        echo $variavel_externa;
        echo "<br>";

        teste();
        echo $variavel_externa;
    ?>
</body>
</html>