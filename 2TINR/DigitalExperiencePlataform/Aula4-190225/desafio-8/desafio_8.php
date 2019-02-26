<?php include("header.php") ?>
<legend class="uk-legend uk-margin">Cadastro de usuário</legend>

<form action="adicionar-usuario.php" method="POST">
    <div class="uk-margin">
        <label>E-mail:</label>
        <input class="uk-input uk-form-width-medium" name="email" type="email" placeholder="yuribreion@gmail.com" required>
    </div>
    <div class="uk-margin">
        <label>Usuário:</label>
        <input class="uk-input uk-form-width-medium" name="user" type="text" placeholder="yuribreion" required>
    </div>
    <div class="uk-margin">
        <label>Senha:</label>
        <input class="uk-input uk-form-width-medium" name="password" type="password" required>
    </div>
    <div class="uk-margin">
        <input type="submit" name="enviar" class="uk-button uk-button-default" value="Submeter">
    </div>
</form>
<?php include("footer.php") ?>