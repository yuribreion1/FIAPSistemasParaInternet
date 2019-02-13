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
        $string = "O carnaval tá chegando";

        //Função que conta caracteres
        strlen($string);

        //Função que converte caracter para maiusculo
        strtoupper($string);

        //Função que converte caracter para minusculo
        strtolower($string);

        //Procura um caracter
        strstr($string, '!');

        if (!strstr($string, '!')) {
            echo "Não tem ponto de exclamação na frase";
        } else {
            echo "Tem ponto de exclamação!!!";
        }
    ?>
</body>
</html>