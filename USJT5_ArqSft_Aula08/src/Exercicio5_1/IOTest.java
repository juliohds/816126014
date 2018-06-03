package Exercicio5_1;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOFacade iof = new IOFacade();
		byte[] byteArray = {1,2,3,4,5};
		iof.gravarArquivoBinario("sys.bin", byteArray);
		iof.lerArquivoBinario("sys.bin");
		
		iof.gravarArquivoTexto("sys.txt", "conteudo teste");
		iof.lerArquivoTexto("sys.txt");
		
		

	}

}
