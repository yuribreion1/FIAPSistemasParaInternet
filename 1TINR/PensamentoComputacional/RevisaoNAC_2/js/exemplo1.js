/* 
    Constantemente utilizamos o bloco forpara iterar sobreatributos de uma coleção, por isso foi criado o bloco for in, iterendosobre um array.

*/
var cidades = ['São Paulo', 'Rio de Janeiro', 'Porto Alegre', 'Suzano'];

for (const cidade in cidades) {
    if (cidades.hasOwnProperty(cidade)) {
        const element = cidades[cidade];
        console.log(element);
        
    }
}