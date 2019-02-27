## Aula 3 - Javascript

Com base em um exemplo simples de função:

``` javascript 
function criaCarro(placa, marca) {
    this.placa = placa;
    this.marca = marca;
    return this;
}

var novo_carro = new criaCarro("1234", "Ford");
novo_carro;
```

Criamos um exemplo para imprimir elementos em `svg`:

``` html
<svg xmlns="http://www.w3.org/2000/svg" id="canvas" width="100%" heigth="1000">
    <circle cx="100" cy="100" r="50" fill="blue"></circle>
</svg>
```

``` javascript
    var circulo = document.createElementNS(svg, "circle");
```

Um elemento foi criado no HTML pelo JS:

``` javascript
    circulo.setAttribute("cx","100");
    circulo.setAttribute("cy","50");
    circulo.setAttribute("r","50");

    canvas.appendChild(circulo);
```

Tudo foi colocando dentro de uma função: 

``` javascript
function circulo(x, y, r) {
    this.x = x;
    this.y = y;
    this.r = r;

    var circulo = document.createElementNS(svg, "circle");

    circulo.setAttribute("cx", x);
    circulo.setAttribute("cy", y);
    circulo.setAttribute("r", r);
    circulo.addEventListener('click', () => {
        alert(this.x + " " + this.y);
    });

    this.setPos = (x, y) => {
        this.element.setAttribute("cx", x);
        this.element.setAttribute("cy", y);
        this.x = x;
        this.y = y;
    }
    this.element = circulo;
    return canvas.appendChild(this.element);
}
```

-   O professor apresentou o [python tutor](http://pythontutor.com/visualize.html#mode=edit)

