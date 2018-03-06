class Exame {
	private String altura;
	private String peso; 
	public String exibirPeso(){
		return peso;
	}

	public void inserirPeso(String pPeso){
		peso=pPeso;	
	}
}

class Churros{
	public static void main(String args[]){
		System.out.println("Olá mundo!");
		Exame exame = new Exame();
		exame.inserirPeso("86kg");
		System.out.println(exame.exibirPeso());
	}
}