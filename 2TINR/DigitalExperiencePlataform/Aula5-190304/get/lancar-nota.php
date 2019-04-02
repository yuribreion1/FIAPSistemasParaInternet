<?php   include("cabecalho.php"); ?>
    <div>
        <form action="calcula-media.php" method="GET">
            <legend class="uk-legend">Nome:</legend> 
            <div class="uk-margin">
                <div class="uk-inline">
                    <span class="uk-form-icon" uk-icon="icon: user"></span>
                    <input class="uk-input" type="text" name="nome" required>
                </div>
            </div>
            <legend class="uk-legend">Disciplina:</legend> 
            <div class="uk-margin">
                <div class="uk-inline">
                    <input class="uk-input" type="text" name="disciplina" required>
                </div>
            </div>
            <h2 class="uk-heading-divider">Notas</h2>
            <legend class="uk-legend">NAC:</legend> 
            <div class="uk-margin">
                <div class="uk-inline">
                    <input class="uk-input" type="text" name="nac" required>
                </div>
            </div>
            <legend class="uk-legend">AM:</legend> 
            <div class="uk-margin">
                <div class="uk-inline">
                    <input class="uk-input" type="text" name="am" required>
                </div>
            </div>
            <legend class="uk-legend">PS:</legend> 
            <div class="uk-margin">
                <div class="uk-inline">
                    <input class="uk-input" type="text" name="ps" required>
                </div>
            </div>
            <button class="uk-button uk-button-default" type="submit">Calcular média</button>
        </form>        
    </div>
    <div class="uk-margin">
        <a href="index.php">Voltar</a>
    </div>
<?php   include("rodape.php") ?>