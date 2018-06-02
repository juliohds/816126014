package Exercicio2_2_FactoryMethod;
/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */


import javax.swing.JOptionPane;

public class ExecutarTexto {

	public static void main(String[] args) {
		FabricaTexto ft = new FabricaTexto();
		
		String men, texto;
		
		texto = JOptionPane.showInputDialog(null, "Digite a informação");
		ft.getTexto(texto);
		
		men = JOptionPane.showInputDialog(null, "Para criar um arquivo público, digite **publico**.\n Para criar um arquivo confidencial digite a senha.");
		
		if(men.equals("publico")){
			
			ft.publico(texto);
			JOptionPane.showMessageDialog(null, "Arquivo Criado com Sucesso"); 
		}
		else if(men.equals("desi gnpatt er ns")){
			ft.confidencial(texto);
			JOptionPane.showMessageDialog(null, "Arquivo Criado com Sucesso"); 
		}
		else{
			JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
		}
		
		System.exit(0);
	}
	

}
