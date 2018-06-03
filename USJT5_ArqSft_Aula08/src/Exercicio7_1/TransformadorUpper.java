package Exercicio7_1;

public class TransformadorUpper extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s.toUpperCase();
	}
}
