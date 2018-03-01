package teste;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ftce.arqsw.entity.Fila;
import br.usjt.ftce.arqsw.service.FilaService;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaService service = new FilaService();
		try {
			ArrayList<Fila> filas = service.ListarFilas();
			for(Fila fila:filas) {
				System.out.println(fila);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
