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
        // Desafio 3 - Media final

        // Notas
        $nota_nac = 7;
        $nota_ps = 8.7;
        $nota_am = 6.2;

        // Pesos das notas

        $peso_nac = 0.2;
        $peso_am = 0.3;
        $peso_ps = 0.5;

        $nota_final = ($nota_nac * $peso_nac) + ($nota_am * $peso_am) + ($nota_ps * $peso_ps);

        echo $nota_final;
    ?>
</body>
</html>