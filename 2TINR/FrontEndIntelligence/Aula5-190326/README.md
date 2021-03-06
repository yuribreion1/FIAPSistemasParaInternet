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

## Outro componente para incorporar um video

- `Youtube.vue`

``` html
<template>
    <iframe :src="url" width="640" height="360" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
</template>

<script>
export default {
    name: 'Youtube',
    props: {
        url: String
    }
}
</script>

<style>

</style>

```

- `App.vue` 

``` html
<template>
  <div id="app">
    <Youtube url="https://player.vimeo.com/video/322667805"/>
  </div>
</template>

<script>
import Youtube from './components/Youtube.vue'

export default {
  name: 'app',
  components: {
    Youtube
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

```

Outra propriedade além do Props, é a `data` que pode guardar um objeto, que é um estado do seu componente:

``` javascript 
export default {
    data(){
        return {
            nome: "Um nome qualquer",
            idade: 30
        }
    }
}
```