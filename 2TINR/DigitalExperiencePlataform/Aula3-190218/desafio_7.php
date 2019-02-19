<?php include("header.php") ?>
<form method="post" action="desafio_7.php">
    <fieldset class="uk-fieldset">
        <legend class="uk-legend">Desafio 7</legend>
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
        <div class="uk-margin">
            <label for="email">E-mail</label>
        </div>
        <div class="uk-margin">
            <input class="uk-input" type="text" name="email" placeholder="yuribreion@br.ibm.com" required>
        </div>
        <div class="uk-margin">
            <label for="cidade">Cidade</label>
        </div>
        <div class="uk-margin">
            <input class="uk-input" type="text" name="cidade" placeholder="Belo Horizonte" required>
        </div>
        <div class="uk-margin">
            <label for="estado">Estado</label>
        </div>
        <div class="uk-margin">
            <input class="uk-input" type="text" name="estado" placeholder="MG" required>
        </div>
        <div class="uk-margin">
        <input type="submit" name="enviar" value="Submeter" class="uk-button uk-button-default" onclick="UIkit.notification({message: 'Solicitação em andamento...'})"
            required>
        </div>
    </fieldset>
</form>

<?php 

    if (isset($_POST['enviar'])) {

         // Pegando valores da requisição
        $usuario = $_POST['usuario'];
        $senha = $_POST['senha'];
        $email = $_POST['email'];
        $cidade = $_POST['cidade'];
        $estado = $_POST['estado'];

        $erro = FALSE;

        if (strlen($usuario) < 5 || strlen($usuario) > 10) {
            $erro = TRUE;
            echo "<script>UIkit.notification({message: 'Usuário fora do padrão!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }

        if (strlen($senha) < 4) {
            $erro = TRUE;
            echo "<script>UIkit.notification({message: 'Senha fora do padrão!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }

        if (strlen($estado) != 2) {
            $erro = TRUE;
            echo "<script>UIkit.notification({message: 'Estado fora do padrão!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }

        if (!strstr($email, '@')) {
            $erro = TRUE;
            echo "<script>UIkit.notification({message: 'E-mail fora do padrão!',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }

        if ($erro == FALSE) {
            echo "<script>UIkit.notification({message: 'Usuário cadastrado com sucesso',status: 'primary',pos: 'bottom-right',timeout: 5000});</script>";
        }
    }
?>

<?php include("footer.php") ?>