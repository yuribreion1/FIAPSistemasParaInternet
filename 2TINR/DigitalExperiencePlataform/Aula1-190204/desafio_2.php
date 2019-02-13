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
            Uma conta é composta por:
            Assinatura: 12,90
            Impostos: 0,04 (se passar de 90 interurbanos)
            Chamadas para celular: 0,20 por minuto

            Sabendo que Maria Lucia ligou 247 vezes no mês sendo:
            e 37 chamadas para celular e 120 interurbanos, qual o valor total da conta?
        */

        $assinatura = 12.90;
        $tarifaInterurbano = 0.04;
        $tarifaCelular = 0.20;
        $qntChamadasMes = 247;
        $qntChamadasCelular = 37;
        $qntInterurbanos = 120;
        $limiteInterurbanos = 90;

        //Pegando a quantidade excedente de interurbanos
        $diferencaInterurbarno = $qntInterurbanos - $limiteInterurbanos;

        //Calculando tarifa de excedente de interurbanos
        $totalExcedente = $diferencaInterurbarno * $tarifaInterurbano;

        //Calculando tarifa de celular
        $totalCelular = $qntChamadasCelular * $tarifaCelular;

        //Total da conta mais excedentes
        $total = $assinatura + $totalCelular + $totalExcedente;

        /*
            Primeiro param : valor/variavel
            Segundo param : quantidade de casas decimais
            Terceiro param : separador de centena,dezena
            Quarto param : separador de milhar
        */
        echo "R$: " . number_format($total, 2, ',','');

    ?>
</body>
</html>