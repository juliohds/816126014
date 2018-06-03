package Exercicio5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IOFacade {

	public void gravarArquivoBinario(String nome, byte[] conteudo) {
		File outFile = new File(nome);
		try {
			FileOutputStream outputStream = new FileOutputStream(outFile);
			outputStream.write(conteudo);
			outputStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void lerArquivoBinario(String nome) {
		File file = new File(nome);

		byte[] bytesArray = new byte[(int) file.length()];
		try {
			FileInputStream is = new FileInputStream(file);
			is.read(bytesArray); 
			is.close();
			for (byte b : bytesArray) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public void gravarArquivoTexto(String nome, String conteudo) {
		try (PrintWriter out = new PrintWriter(nome)) {
			out.println(conteudo);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoTexto(String nome) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(nome));
			System.out.println(reader.readLine());
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
