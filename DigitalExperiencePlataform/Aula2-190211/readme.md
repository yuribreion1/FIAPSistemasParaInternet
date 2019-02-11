# Aula do dia 11 de Fevereiro

1.  Uma breve descrição foi apresentada
2.  Uma pequena revisão foi feita do ultimo [exercicio](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/desafio3-revisao.php) que faz o calculo do aluno com as notas/faltas

## Switch case 
-   [Definição de Switch](https://www.devmedia.com.br/php-estrutura-condicional-switch-case/38223), segue um [exercicio feito em sala](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/switch_case.php).

```php
<?php
    $numero = 40;
    
    switch ($numero) {
        case 34:
            echo "Esse é o 34";
            break;
        case 37:
            echo "Esse é o 37";
            break;
        case 35:
            echo "Esse é o 35";
            break;
        case 40:
            echo "Esse enfim é o 40!";
        default:
            echo "<br>Fim do programa";
            break;
    }
    ?>
```

## Laços de repetição

### For

```php
    <?php 
       for ($contador=0; $contador <= 20; $contador++) { 
           echo "Boa noite turma<br>";
       } 
    ?>
```
-   Exemplo feito [aqui](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/lacoFor.php)

### While

```php
    <?php 
        $contador = 0;
        while ($contador < 10) {
            echo "<h1>Boa noite turma!</h1>" . "<br>";
            $contador++;
        }
    ?>
```
-   Exemplo feito [aqui](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/while.php)

### Foreach

-   Percorre o vetor e grava o valor em uma variável auxiliar dentro do processo

```php
    <?php 
    $numeros = array(2, 7, 18, 96, 12);

       foreach ($numeros as $numero) {
           echo $numero . "<br>";
       } 
    ?>
```
-   Exemplo feito [aqui](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/foreach.php)

#### Professor compartilhou um desafio para tabuada

> Imprima na tela as tabuadas de 1 a 10, utilizando os conceitos das aulas anteriores

```php
    <?php 
       for ($multiplicando=1; $multiplicando < 9; $multiplicando++) { 
           for ($multiplicador=1; $multiplicador <= 10 ; $multiplicador++) { 
               echo "Tabuada do " . $multiplicador . "<br>";
               
           }
       }
    ?>
```

-   Segue exercicio feito [aqui](https://github.com/yuribreion1/FIAPSistemasParaInternet/blob/master/DigitalExperiencePlataform/Aula2-190211/desafio_4.php).