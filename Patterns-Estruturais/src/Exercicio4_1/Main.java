package Exercicio4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Cria os pares em uma matriz.
		Object[][] pares = new String[][] { { "Sun", "IBM", "FSF", "Berkley", "Microsoft", "Apple" }, { "Solaris", "OS/2", "GNU/Linux", "BSD", "Windows", "MacOS" } };

		// Cria um novo mapa com a matriz.
		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);

		// Imprime os valores.
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
