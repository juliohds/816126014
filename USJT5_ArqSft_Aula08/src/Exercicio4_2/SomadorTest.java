package Exercicio4_2;

public class SomadorTest {
	public static void main(String args[]) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
