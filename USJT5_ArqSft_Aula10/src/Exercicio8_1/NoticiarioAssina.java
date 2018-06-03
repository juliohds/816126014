package Exercicio8_1;

import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario {
	private List<Consumidor> consumidores = new ArrayList<Consumidor>();
	private Noticia noticia;
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.noticia = new Noticia(textoNoticia,dia, mes, topico);
		this.notificarConsumidores();
	};
	
	public void inscrever(Consumidor consumidor) {
		this.consumidores.add(consumidor);
		System.out.println(consumidor.getNome()+" se inscreveu ao Noticiario");
	}
	
	public void notificarConsumidores() {
		System.out.println("--- Notificando todos os consumidores ---");
		for (Consumidor consumidor : this.consumidores) {
			consumidor.update();
		}
		System.out.println("-----------------------------------------");
	}
	
	public Noticia getNoticia() {
		return this.noticia;
	}
}
