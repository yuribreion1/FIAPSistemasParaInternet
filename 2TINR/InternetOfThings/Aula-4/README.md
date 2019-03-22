### Aula 4 - 21/03/2019 - Internet of Things

#### Código de cores de resistores:

- Professor explicou como é calculado o resistor:

    ![codigo de resistores](http://3.bp.blogspot.com/-aQat5vKmdqs/VQbqRVvdd8I/AAAAAAAAATE/JNvIZ4Mw0l4/s1600/codigo_de_cores_resistores.png)

- Também comentou como é calculada a resistência para usar o componente no valor correto:

    ![calculo de resistencia](https://1.bp.blogspot.com/-v-AjkP_C0Ms/VOfw2JrqP-I/AAAAAAAACkw/dN9tukoS7to/s1600/10373651_657546340998471_8642577972045171287_n.png)

    > Exemplo: Vamos imaginar um LED de 2V com corrente de 20mA sendo alimentado por 5V:
    R = (5V - 2V) / 0.02A
    R = 3V / 0.02A
    R = 150 ohm

- Partindo para a parte prática, foram dados os valores em ohms e temos que determinar as cores:
    -   1 ohm       -> **_Preto/Marrom/Preto_**
    -   68 ohms     -> **_Azul/Cinza/Preto_**
    -   150 ohms    -> **_Marrom/Verde/Marrom_**
    -   220 ohms    -> **_Vermelho/Vermelho/Marrom_**
    -   330 ohms    -> **_Laranja/Laranja/Marrom_**
    -   468 ohms    -> **_Amarelo/Azul/Marrom_**
    -   680 ohms    -> **_Azul/Cinza/Marrom_**
    -   10k ohms    -> **_Marrom/Preto/Laranja_**
    -   15k ohms    -> **_Marrom/Vermelho/Laranja_**
    -   1.5k ohms   -> **_Marrom/Verde/Vermelho_**
    -   2.2k ohms   -> **_Vermelho/Vermelho/Vermelho_**
    -   3.3k ohms   -> **_Laranja/Laranja/Vermelho_**
    -   4.4k ohms   -> **_Amarelo/Amarelo/Vermelho_**

- Agora temos o cenário oposto, dando as cores e determinando o seu valor:
    -   Vermelho, Vermelho, Preto, Prata    -> **_22 ohms tendo o minimo 18.8 e máximo 24.2 ohms_**
    -   Marrom, Preto, Preto, Prata         -> **_10 ohms tendo o minimo 9 e máximo 11 ohms_**
    -   Verde, Azul, Preto, Dourado         -> **_56 ohms tendo o minimo 53.2 e máximo 58.8 no máximo_**