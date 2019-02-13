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

       for ($multiplicando=1; $multiplicando <= 9; $multiplicando++) { 
        echo "<br>Tabuada do " . $multiplicando . "<br>";
           for ($multiplicador=1; $multiplicador <= 10 ; $multiplicador++) { 
               echo "<br>" . $multiplicando . " * " . $multiplicador . " = " . $multiplicando * $multiplicador;
               
           }
           echo "<br>";
       }
    ?>
</body>
</html>