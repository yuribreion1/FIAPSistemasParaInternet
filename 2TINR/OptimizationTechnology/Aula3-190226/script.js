const svg = "http://www.w3.org/2000/svg";
var canvas = document.getElementById("canvas");

function circulo(x, y, r) {
    this.x = x;
    this.y = y;
    this.r = r;

    var circulo = document.createElementNS(svg, "circle");

    circulo.setAttribute("cx", x);
    circulo.setAttribute("cy", y);
    circulo.setAttribute("r", r);
    this.click = undefined;

    circulo.addEventListener('click', () => {
        if (this.click != undefined && this.click != null) {
            this.click();
        }
    });

    this.setPos = (x, y) => {
        this.element.setAttribute("cx", x);
        this.element.setAttribute("cy", y);
        this.x = x;
        this.y = y;
    }

    circulo.addEventListener('mousedown', () => {
        this.movendo = true;
    });

    circulo.addEventListener('mousemove', (ev) => {
        if (this.movendo) this.setPos(ev.x, ev.y);
    });

    circulo.addEventListener('mouseup', () => {
        this.movendo = false;
    });

    this.element = circulo;
    return canvas.appendChild(this.element);
}

for (let index = 0; index < 100; index++) {
    var c1 = new circulo(200, 10, 20);
    c1.click = () => {
        alert('Cliquei');
    }
}

window.addEventListener("load", event => {
    alert('Pagina carregou');
});