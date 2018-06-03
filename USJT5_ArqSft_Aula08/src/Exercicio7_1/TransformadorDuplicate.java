package Exercicio7_1;

public class TransformadorDuplicate extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s+" "+s;
	}
}
