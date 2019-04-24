## Aula - Optimization Technology

> _Webpack_ permite que o nosso código seja quebrado em partes menores, facilitando a manutenção

- Criamos nosso arquivo `webpack.config.js`: 
    ```
        var path = require('path');
            module.exports = {
            mode: 'development',
            entry: './index.js',
            output: {
                path: path.resolve(__dirname, 'dist'),
                filename: './bundle.js'
            }
        };
```

- Para executar o projeto basta digitar `webpack --watch` para usar no formato _live action_