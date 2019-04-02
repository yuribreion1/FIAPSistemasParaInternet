<?php
    $nome = $_GET['nome'];
    $disciplina = $_GET['disciplina'];
    $nac = $_GET['nac'];
    $am = $_GET['am'];
    $ps = $_GET['ps'];

    function calcularMedia($nome, $nac, $am, $ps) {
        $media = (($nac * .2) + ($am * .3) + ($ps * .5));

        if ($media < 6) {
            ?>
                <div class="uk-alert-danger" uk-alert>
                    <a class="uk-alert-close" uk-close></a>
                    <p>Aluno <?= $nome ?> com média <?= $media ?>, esta REPROVADO</p>
                </div>
            <?php
        } else {
            ?>
                <div class="uk-alert-success" uk-alert>
                    <a class="uk-alert-close" uk-close></a>
                    <p>Aluno <?= $nome ?> com média <?= $media ?>, esta APROVADO</p>
                </div>
            <?php
        } 
        return $media;
    }
    ?>