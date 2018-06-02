package Exercicio2_2_FactoryMethod;
/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){
		
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
