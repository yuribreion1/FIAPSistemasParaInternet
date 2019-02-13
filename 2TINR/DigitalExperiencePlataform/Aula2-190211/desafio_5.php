
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

        function converteParaFahrenheit($celsius) {
            return ($celsius * 1.8) + 32;
        }

        echo converteParaFahrenheit(30);
    ?>
</body>
</html>