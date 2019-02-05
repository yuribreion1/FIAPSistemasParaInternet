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
       if (4 == 4) {
           echo "Sim é verdade, é igual";
       } elseif (4 <= 4) {
           echo "Sim é verdade, 4 é menor que 4";
       } elseif (4 != 4) {
            echo "Sim é verdade, 4 é diferente de 4";
       } elseif (4 === 4) {
            echo "Sim é verdade, 4 é o mesmo tipo de 4";
       } 
       
       if (4 === '4' || 4 < 5) {
            echo "Sim é verdade, uma das opções é verdade";
       }
       
    ?>
</body>
</html>