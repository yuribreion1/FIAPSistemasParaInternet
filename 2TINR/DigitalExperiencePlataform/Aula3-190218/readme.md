## Aula 3 - 18/02/2019

### Revisamos e corrigimos o exercicio da ultima aula: 

> Crie uma função que sorteia os números da Mega Sena. Exiba em ordem crescente como no exemplo.

Código do desafio esta disponível [aqui](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/2TINR/DigitalExperiencePlataform/Aula3-190218/desafio_6.php)

```php
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PHP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<!-- Crie uma função que sorteia os números da Mega Sena.
    Exiba em ordem crescente como no exemplo. -->
    <?php 
        $numeros = array(26, 34, 37, 51, 55, 59);

        function sorteio() {
                echo "<br>Sorteio automático de números: <br>";
            
            for ($numero=0; $numero < 5; $numero++) { 
                echo " Número: " . rand(1, 60) . "<br>";
            }
        }

        echo "Os números sorteados da Mega Sena são: " . implode(",",$numeros) . "<br>";
        echo sorteio();

    ?>
</body>
</html>

```

Este código pode ser melhorado considerando que os valores sejam gerados de forma randomica e não apenas se repetissem.
Outra solução é não gravar números repetidos.

```php
<?php 
        function sorteio() {

                //Recebendo números
                $n = array();

                // Usando o while para executar até que a regra seja atendida
                while (count($n) < 6) {
                    $valor = rand(1, 60);
                    $n[$valor] = $valor;
                }
                sort($n);
                echo "Os números sorteados da Mega Sena são: " . implode(",",$n) . "<br>";
            }
        echo sorteio();
    ?>
```

Muitas duvidas surgiram a respeito de escopo de variáveis: local e global e um exemplo foi feito a este respeito

O termo **global** altera o escopo da variável:

``` php
<?php 
        $variavel_externa = "fora";

        function teste() {

            // Termo global altera o escopo da variavel
            global $variavel_externa;

            $variavel_externa = "dentro";
            $variavel_interna = "local";
        }

        echo $variavel_externa;
        echo "<br>";

        teste();
        echo $variavel_externa;
    ?>
```

As linguagens usadas no _backend_ estão muito ligadas a web, então compreender o conceito de _requisições HTTP_ é muito importante, segue algumas delas: 

-   GET
-   POST
-   PUT
-   DELETE

Podemos trabalhar com elas aqui, segue um exemplo do _POST_:

``` php
<?php
    if (isset($_POST['enviar'])) {
        echo "Feita a requisicão do tipo POST";

        //Pegando valor do atributo name usado no HTML, passado pelo POST
        $descricao = $_POST['descricao'];
    }
```

Segue um exemplo mais completo para usuário e senha com o framework `UIKIT`:

``` php
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
```