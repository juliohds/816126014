package Exercicio7_1;

public class TransformadorLower extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s.toLowerCase();
	}
}
