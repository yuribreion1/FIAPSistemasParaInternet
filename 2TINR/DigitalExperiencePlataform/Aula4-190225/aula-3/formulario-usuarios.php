<?php include("header.php") ?>
<legend class="uk-legend uk-margin">Cadastro de usuário</legend>
<form action="adicionar-usuario.php">
    <div class="uk-margin">
        <label>Usuário:</label>
        <input class="uk-input uk-form-width-medium" name="usuario" type="text" placeholder="yuribreion" required>
    </div>
    <div class="uk-margin">
        <label>Senha:</label>
        <input class="uk-input uk-form-width-medium" name="senha" type="password" required>
    </div>
    <div class="uk-margin">
        <button class="uk-button uk-button-default">Submeter</button>
    </div>
</form>
<?php include("footer.php") ?>