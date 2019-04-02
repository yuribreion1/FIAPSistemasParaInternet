<?php   include("cabecalho.php"); 
        include("funcoes.php"); ?>
    <?php
        $nome = $_GET['nome'];
        $disciplina = $_GET['disciplina'];
        $nac = $_GET['nac'];
        $am = $_GET['am'];
        $ps = $_GET['ps'];
    ?>

    <h1 class="uk-heading-primary uk-margin">Desafio 10</h1>
    <script>
        UIkit.notification({message: 'Aluno cadastrado com sucesso', status: 'primary'})
    </script>
    <?php calcularMedia($nome, $nac, $am, $ps);  ?>
    <a href="./index.php">Voltar</a>
<?php   include("rodape.php"); ?>