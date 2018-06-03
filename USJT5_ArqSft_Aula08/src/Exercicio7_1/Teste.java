package Exercicio7_1;

public class Teste {

	public static void main(String[] args) {
		TransformadorTemplate tu = new TransformadorUpper();
		tu.run();
		TransformadorTemplate tl = new TransformadorLower();
		tl.run();
		TransformadorTemplate td = new TransformadorDuplicate();
		td.run();
		TransformadorTemplate tr = new TransformadorReverse();
		tr.run();

	}

}
