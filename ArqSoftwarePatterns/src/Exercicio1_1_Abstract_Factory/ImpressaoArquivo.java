package Exercicio1_1_Abstract_Factory;

 /**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */
import java.io.File;
import java.io.PrintWriter;

//Impressão em arquivo
public class ImpressaoArquivo implements Impressao {
	// Arquivo que será imprimido
	private File arquivo;

	//Construtor
	public ImpressaoArquivo(String nomeArquivo) {
		this.arquivo = new File(nomeArquivo);
	}

	public void imprimir(String string) {
		// Tenta criar um novo arquivo e imprimir nele.
		try {
			arquivo.createNewFile();
			PrintWriter writer = new PrintWriter(arquivo);
			writer.print(string);
			writer.close();

			// Avisa que tudo correu bem.
			System.out.println("Verifique arquivo: " + arquivo.getCanonicalPath());
		}

		// Caso ocorra algum problema
		catch (Exception e) {
			System.out.println("Não foi possivel criar o arquivo output.txt");
		}
	}

}
