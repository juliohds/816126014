package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

//Fabrica de impressão na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
