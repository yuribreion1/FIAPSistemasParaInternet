## Mobilidade Corporativa - iOS

1.  Iniciamos um novo projeto no `X Code`
2.  Criamos duas `labels` para `outlets`, uma como nome outra como idade na `ViewController.h`, isso usando `Main.storyboard`

``` Object-c
    __weak IBOutlet UILabel *nome;
    __weak IBOutlet UILabel *idade;
```

3.  No arquivo `ViewController.m` usamos a lógica para atribuir valores ao `label`: 

``` Object-c
    nome.text = @"Nome";
    idade.text = @"Idade";
```

4.  Criamos um botão e criamos uma `action` recebendo os novos valores para o campo: 

``` Object-c
    - (IBAction)exibir:(id)sender {
    nome.text = @"Yuri";
    idade.text = @"32 anos";
}
```

5.  Definimos icones para o projeto, clicando no projeto e na aba `App Icons and Launch Images` e podemos carregas as imagens para cada versão de iOS. Quando maior o tamanho do arquivo, melhor para poder renderizar o mesmo para tamanhos menores.