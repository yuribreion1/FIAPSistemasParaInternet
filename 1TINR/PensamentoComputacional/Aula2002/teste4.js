var nac = 3.5;
var am = 6.8;
var ps = 7.9;
var ms = (nac * 0.2) + (am * 0.3) + (ps * 0.5);

console.log("O valor da media semestral é: " + ms);
document.write("O valor da media semestral é: " + ms);

if (ms > 6) {
  console.log("Aprovado");
  document.write("<br><b>Aluno aprovado!</b>")
} else if (ms < 6 && ms > 4) {
  console.log("Exame");
  document.write("<br><b>Aluno de Exame!</b>");
} else if (ms < 4){
  console.log("Reprovado");
  document.write("<br><b>Aluno reprovado!</b>")
}
