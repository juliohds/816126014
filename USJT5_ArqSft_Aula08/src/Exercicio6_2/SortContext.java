package Exercicio6_2;

public class SortContext {

	private Sort sort;
	
	public SortContext(Sort sort) {
		this.sort = sort;
	}
	
	public int[] sort(int[] v) {
		return sort.sort(v);
	}
}
