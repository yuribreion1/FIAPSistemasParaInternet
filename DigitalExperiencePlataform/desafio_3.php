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
        /*
            Desafio 3:
            Monte um programa para calcular a média do aluno, 
            e a porcentagem de faltas para saber se ele está aprovado ou reprovado na matéria
            Digital Experience Plataform sabendo que ele faltou 18 aulas de 70 e tirou as notas:
                NAC: 7
                AM: 8.7
                PS: 6.2
                Faltas: 20%
        */

        $faltasTiradas = 18;
        $faltasMaximo = 70 * .2;
        $am = 8.7;
        $nac = 7;
        $ps = 6.2;


        $mediaSemestral = (($nac * .2) + ($am * .3) + ($ps * .5));
        $fechamentoFaltas = $faltasTiradas > $faltasMaximo;

        if ($faltasTiradas <= 14 && $mediaSemestral >= 6 ) {
            echo "Aprovado";
        } else {
            echo "Reprovado";
        }


        
    ?>
</body>
</html>