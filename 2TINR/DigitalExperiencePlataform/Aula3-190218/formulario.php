<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/uikit.min.css" />
    <script src="js/uikit.min.js"></script>
    <script src="js/uikit-icons.min.js"></script>
    <title>Formuário</title>
</head>
<?php 
        if (isset($_POST['enviar'])) {
            $usuario = $_POST['usuario'];
            $senha = $_POST['senha'];

            if ($usuario && $senha) {
                echo "Seu usuário é: " . $usuario;
                echo "<br>";
                echo "Sua senha é: " . $senha;
            } else {
                echo "O campo não pode estar em branco";
            }
        }
    ?>
<body>
    <main class="uk-container">
        <form method="post" action="formulario.php">
            <fieldset class="uk-fieldset">
                <legend class="uk-legend">Autenticação</legend>
                <div class="uk-margin">
                    <label for="usuario">Usuário</label>    
                </div>
                <div class="uk-margin">
                    <input class="uk-input" type="text" name="usuario" placeholder="Usuario" required>
                </div>
                <div class="uk-margin">
                    <label for="senha">Senha:</label>    
                </div>
                <div class="uk-margin">
                    <input class="uk-input" type="password" name="senha">
                </div>
                <input type="submit" name="enviar" value="Submeter" class="uk-button uk-button-default" onclick="UIkit.notification({message: 'Solicitação em andamento...'})" required>
            </fieldset>
        </form>
    </main>
</body>

</html>