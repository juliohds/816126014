package Exercicio2_3_FactoryMethod;

/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JOptionPane;

public class FabricaNumero {
	
	public String contar(){
		String j = "";
		for(int i = 0; i <= 10; i++){
			j += i + " ";
		}
		
		return j;
	}
	
	public void mostrar(String men){
		if(men.equals("console")){
			System.out.print(contar());
		}
		
		else if(men.equals("arquivo")){
			try {
			      PrintStream out = new PrintStream(new FileOutputStream("log.txt"));
			 
			        out.println("Este arquivo é um log:\n " + contar());

			      out.close();

			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			    }
			System.out.printf("Sucesso");
		}
		else{
			JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
		}
		
	}

}