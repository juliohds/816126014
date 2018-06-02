package Exercicio2_2_FactoryMethod;

/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FabricaTexto {
	public Texto getTexto(String texto){
		return new ProvedorInformacao(texto);
	}
	
	public void publico(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("publico.txt"));
		 
		        out.println(" Estas informações são públicas. Todo mundo pode ver este arquivo.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
	
	public void confidencial(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("confidencial.txt"));
		 
		        out.println(" Estas informações são confidenciais,\n o que significa que provavelmente só você sabe a senha.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
}
