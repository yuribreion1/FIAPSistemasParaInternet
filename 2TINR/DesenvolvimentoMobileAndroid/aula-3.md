## Aula 3 - 01/03/2019

### Jogos dos dados

- Atribuir `id` para os atributos `ImageView`
- No método jogar vamos atribuir a imagem de cada dado
- Criar um vetor onde cada elemento é a chamada da imagem
    ``` java 
    int[] = imagens = {
        R.drawable.d1,
        R.drawable.d2,
        R.drawable.d3,
        R.drawable.d4,
        R.drawable.d5,
        R.drawable.d6,
    }
    ```

- Instanciamos os jogadores
    ``` java
    ImageView = imgJogador1;
    ImageView = imgJogador2;
    ```

- Inicializamos os jogados, linkando o `xml` ao `java`
    ``` java
    imgJogador1 = findViewById(R.id.imgJogador1);
    imgJogador2 = findViewById(R.id.imgJogador2);
    ```

- Agora os números precisam ser gerados `randomicamente` usando a classe `Random`
    ``` java 
    Random r = new Random();
    ```

- Acionamos a chamada 
    ``` java
    // nextInt traz um número aleatorio - 1
    int a = r.nextInt( imagens.length );
    int b = r.nextInt( imagens.length );
    ```

- Os jogadores efetivamente jogando e define a imagem...
    ``` java
    imgJogador1 = setImageResource( imagens[a] );
    imgJogador2 = setImageResource( imagens[b] );
    ```

- Por ultimo, fazemos a verificação de quem ganhou o jogo:
``` java
if (dado1.getNumero() > dado2.getNumero()) {
    Toast.makeText(this,"Jogador 1 venceu!",1). show();
} else if (dado1.getNumero() < dado2.getNumero()) {
    Toast.makeText(this,"Jogador 2 venceu!",1). show();
} else {
    Toast.makeText(this,"Deu empate", 1). show();
}
```
### Desafio 

> Ter uma imagem de quadrado e outra de triangulo, quando clicar em jogar eles trocam

- Criamos uma variável de controle como contador, `cont`
    ``` java
    if (cont == 0) {
            item1.setImageResource(R.drawable.square);
            item2.setImageResource(R.drawable.triangle);
            cont++;
            // Passará a ser cont = 1
        } else {
            item1.setImageResource(R.drawable.triangle);
            item2.setImageResource(R.drawable.square);
            cont = 0;
            // Voltamos para 0 para entrar na primeira condição
        }
    ```

- Uma versão mais otimizada seria:
    ``` java
        Drawable aux = img1.getDrawable();

        img1.setImageDrawable( img2.getDrawable() ); // Imagem 1 segue a imagem2
        img2.setImageDrawable( aux ); // Imagem 2 recebe imagem 1
    ```

### Internacionalização - Detectar idioma

> "Nem tudo que é simples é o mais eficiente" - _Cabral_

- Criamos um programa que recebe `nome` e `celular` com dois campos de `input`
    ``` xml
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nome"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Celular"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="phone"/>
    ```

- Vamos passar a criar variaveis agora ao invés de setar um valor no atributo:
    ``` xml
    android:text="";
    ```

- Dentro da pasta `res` criamos um novo `values resource file` para o outro idioma dentro da pasta `values` como `values-en` no caso do ingles, veja como ficam os arquivos: 

    **PT-BR**
    ``` xml
    <resources>
        <string name="app_name">Internacionalização</string>
        <string name="nome">Nome</string>
        <string name="celular">Celular</string>
        <string name="salvar">Salvar</string>
    </resources>
    ```

    **EN**
    ``` xml
    <resources>
        <string name="app_name">Internationalization</string>
        <string name="nome">Name</string>
        <string name="celular">Cellphone</string>
        <string name="salvar">Save</string>
    </resources>
    ```

    **DE**
    ``` xml
    <resources>
        <string name="app_name">Internationalization</string>
        <string name="nome">Name</string>
        <string name="celular">Handynummer</string>
        <string name="salvar">Speichern</string>
    </resources>
    ```