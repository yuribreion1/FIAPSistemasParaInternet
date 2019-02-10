# Aula 1 - 08/02/2019

### Alguns detalhes e beneficios do Android em relação ao iOS

- Sistema aberto
- É gratuito para publicar seu aplicativo

### Uso do Linux

- Existem várias distribuições
    -   [Ubuntu](https://www.ubuntu.com/)
    -   [Red Hat](https://www.redhat.com/pt-br)
    -   [Arch Linux](https://www.archlinux.org/art/)
    -   [Fedora](https://getfedora.org/pt_BR/)
- É de código aberto
- É possível controlar o que de fato é executado no equipamento

### Iniciando com Android

Para iniciar os trabalhos, temos que instalar o [Android Studio](https://developer.android.com/studio/?hl=pt-br).

Primeiros passos para o seu código: 

1. Start a new Android Studio project
    1.1. As telas do Android são chamadas de `Activity`
    1.2. Selecionar **sempre** a opção `Empty Activity`
    1.3. Em _Company Name_ manter a nomenclatura de pacotes usada em Java por exemplo
    1.4. O nome do pacote é sempre o que separa um aplicativo de outro na [Google Play](https://play.google.com/), é o identificador.

    **ALT + ENTER resolve todos os problemas de importação**

2. Vamos trabalhar com a `API 26: Android 8.0` que é o [Oreo](https://www.android.com/versions/oreo-8-0/.)
3. **_Detalhe:_** Nos laboratórios da FIAP precisa pedir para habilitar o **Firewall**
4. Toda `Activity` é uma classe como no Java
5. Criando nossa primeira mensagem
    ```java
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaginha(View view) {
        Toast.makeText( context: this, resId: "Primeiro toast", Toast.LENGTH_SHORT).show();
    }
    ```
    O valor do activity_main foi definido dentro do `activity_main.xml` no atributo `<Button>`

6. Aplicando a mensagem diretamente usando uma _label_ 
    ```xml 
    <TextView>
        android:layout_width: "wrap_content"
        android:layout_height= "wrap_content"
        android:text="Digite seu nome" />

    <EditText>
        android:layout_width: "wrap_content"
        android:layout_height= "wrap_content"
        android:id="@id/edtNumero" />     //Inicializando a variavel edtNumero
    ```

    > O atributo **wrap_content** significa que ele usa somente a largura ou altura necessária para o componente_

7. Passando o valor entrado no campo para a lógica da aplicação: 
    ```java
    EditText edtNumero;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = findViewById(R.id.edtNumero);
    }

    public void mensaginha(View view) {
        String txt = edtNumero.getText().toString();
        Toast.makeText( context: this, txt, Toast.LENGTH_SHORT).show();
    }

    ```

#### Para exportar o seu projeto ao inves Android Studio: 
- `File > Export to Zip File`

#### Conteúdo extra aula

- Adicionado um ID no `xml` para ser manipulado no `Activity`

```xml
android:id="@+id/lista_alunos"
```