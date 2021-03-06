# Aula 2 - 15/02/2019

[Código do projeto no Git](https://github.com/yuribreion1/aula01Android)

## Inserindo icones ao projeto

-   Baixar icones do [IconFinder](https://www.iconfinder.com/)
-   Salvamos as imagens no projeto dentro da pasta `drawable`

## Colocando imagem a tela

-   Criamos a tag `ImageView`

    ``` xml
     <ImageView
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:layout_gravity="center_horizontal" //Alinhar imagem
     android:src="@drawable/p1"
     android:id="@+id/imgPessoa"/> //Id para ser instanciado
     ```

-   Criamos três botões para cada pessoa

    ``` xml

     <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="pessoa01"
     android:text="Pessoa 01"/>

    <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="pessoa02"
     android:text="Pessoa 02"/>

    <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="pessoa03"
     android:text="Pessoa 03"/>
     ```

-   Instanciamos a variável que receberá o ID no `MainActivity.java`

    `ImageView imgPessoa;`

    Instanciamos uma view para receber cada tipo de imagem:

    ``` java
    public void pessoa01(View view) {
        imgPessoa.setImageResource(R.drawable.p1);
    }

    public void pessoa02(View view) {
        imgPessoa.setImageResource(R.drawable.p2);
    }

    public void pessoa03(View view) {
        imgPessoa.setImageResource(R.drawable.p3);
    }
    ```

-   Uma forma refatorada sem repetir código pode ser feita, definindo a mesma variável para os 3 botões e atribuir um ID para cada botão: 
    <br>
    ``` xml
      <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="alterarImagem"
     android:text="Pessoa 01"
     android:id="@+id/btn1"/>

     <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="alterarImagem"
     android:text="Pessoa 02"
     android:id="@+id/btn2"/>

    <Button
     android:layout_width="match_parent"
     android:layout_height="wrap_content"
     android:onClick="alterarImagem"
     android:text="Pessoa 03"
     android:id="@+id/btn3"/>
     ```

    No `MainActivity.java`:
    <br>

    ``` java
    public void alterarImagem(View view) {
        
        // Pegando ID do xml
        switch (view.getId()) {
            case R.id.btn1:
            imgPessoa.setImageResource(R.drawable.p1);
            break;

            case R.id.btn2:
            imgPessoa.setImageResource(R.drawable.p2);
            break;

            case R.id.btn3:
            imgPessoa.setImageResource(R.drawable.p3);
            break;

        }
    }
    ```