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
    $numeros = array(2, 7, 18, 96, 12);

       foreach ($numeros as $numero) {
           echo $numero . "<br>";
       } 
    ?>
</body>
</html>