package Exercicio6_1;

public class Context {
	private Mensageiro mensageiro;

	public Context(int dia) {
		switch (dia) {
		case 0:
			this.mensageiro = new MensageiroDomingo();
			break;
		case 1:
			this.mensageiro = new MensageiroSegunda();
			break;
		case 2:
			this.mensageiro = new MensageiroTerca();
			break;
		case 3:
			this.mensageiro = new MensageiroQuarta();
			break;
		case 4:
			this.mensageiro = new MensageiroQuinta();
			break;
		case 5:
			this.mensageiro = new MensageiroSexta();
			break;
		case 6:
			this.mensageiro = new MensageiroSabado();
			break;
		}
	}

	public void exibirMensagem() {
		this.mensageiro.exibirMensagem();
	}

}
