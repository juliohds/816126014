package Exercicio2_1_FactoryMethod;



public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}