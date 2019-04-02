<?php include("cabecalho.php"); ?>
    <form action="cadastrar-eleitorado.php" method="post">
        <div class="uk-margin">
            <label class="uk-form-label" for="total">Total de eleitores:</label>
            <div class="uk-form-controls">
                <input class="uk-input" name="total" id="total" type="number" required>
            </div>
            <div class="uk-margin">
                <label class="uk-form-label" for="brancos">Brancos</label>
                <div class="uk-form-controls">
                    <input class="uk-input" name="brancos" id="brancos" type="number" required>
                </div>
            </div>
            <div class="uk-margin">
                <label class="uk-form-label" for="nulos">Nulos</label>
                <div class="uk-form-controls">
                    <input class="uk-input" name="nulos" id="nulos" type="number" required>
                </div>
            </div>
            <div class="uk-margin">
                <label class="uk-form-label" for="validos">Validos</label>
                <div class="uk-form-controls">
                    <input class="uk-input" name="validos" id="validos" type="number" required>
                </div>
            </div>
            <button class="uk-button uk-button-default" type="submit">Submeter</button>
            <br>
            <hr>
            <a href="index.php">Voltar</a>
    </form>
<?php include("rodape.php"); ?>