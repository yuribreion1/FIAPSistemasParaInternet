## Criação de uma _single page application_ com Vue.js

- Abrir o _vscode_
- Acessando o terminal a partir da pasta do projeto executar `npm install @vue/cli`
- `./node_modules/.bin/vue create meu_site`
- Acessar a sua pasta `cd meu_site`
- Executar usando `npm run serve`

Se der certo você vai receber:

```
  App running at:
  - Local:   http://localhost:8080/
  - Network: http://172.16.58.124:8080/
```

Com o _node js_ podemos injetar arquivos _Javascript_ como o uso do `require`

- Notamos que foi gerado um arquivo chamado `App.vue` que é renderizado dentro do _main.js_
- Os atributos da tag são as propriedades do componente

### Criamos uma nova propriedade: 

``` html
<template>
    <Mensagem msg="Aqui é a minha propriedade"/>
</template>
<script>
    import Mensagem from './components/Mensagem.vue'

    export default {
  name: 'app',
  components: {
    HelloWorld,
    Mensagem
  }
}
</script>
```

- Dentro do `Mensagem.vue`: 

``` html
<template>
    <div class="bloco">
        {{ msg }}
    </div>
</template>

<script>
export default {
    name: 'Mensagem',
    props: {
        msg: String
    }
}
</script>

<style>
.bloco {
    color: red;
}
</style>

```

** Dentro do arquivo `.vue` a propriedade _scaffold_ já cria a estrutura correta, instalar o [vetur](https://github.com/vuejs/vetur) **