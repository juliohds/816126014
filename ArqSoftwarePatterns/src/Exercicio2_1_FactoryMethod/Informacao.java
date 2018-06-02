package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

public class Informacao extends Nome{
	
	public Informacao(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println(nome + " " + sobrenome + "\n" + sobrenome + ", " + nome);
	}
	
}
