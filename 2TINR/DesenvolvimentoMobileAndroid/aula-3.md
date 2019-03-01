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
