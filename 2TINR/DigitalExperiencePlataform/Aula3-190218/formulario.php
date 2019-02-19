<?php include("header.php") ?>
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
        <input type="submit" name="enviar" value="Submeter" class="uk-button uk-button-default" onclick="UIkit.notification({message: 'Solicitação em andamento...'})"
            required>
    </fieldset>
</form>
</main>
<?php 
    if (isset($_POST['enviar'])) {

        //Extraindo dados passados no POST
        $usuario = $_POST['usuario'];
        $senha = $_POST['senha'];

        if ($usuario && $senha) {
            echo "<script>UIkit.notification({message: 'Usuário autenticado!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        } else {
            echo "<script>UIkit.notification({message: 'Dados em branco!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }
    }
?>
<?php include("footer.php") ?>