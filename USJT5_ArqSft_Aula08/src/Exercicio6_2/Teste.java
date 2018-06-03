package Exercicio6_2;

public class Teste {

	public static void main(String[] args) {
		int[] v = { 323, 14, 234, 234, 23, 423, 4, 23, 4, 32, 5, 23, 4, 23, 4, 23, 4, 23, 4, 32, };
		SortContext sc = new SortContext(new BubbleSort());
		for (int i: v) {
			System.out.print(i+", ");
		}
		System.out.println("");
		System.out.println("----sorted-----");
		sc.sort(v);
		for (int i: v) {
			System.out.print(i+", ");
		}
		System.out.println("");
		
		int[] v2 = { 323, 14, 234, 234, 23, 423, 4, 23, 4, 32, 5, 23, 4, 23, 4, 23, 4, 23, 4, 32, };
		 sc = new SortContext(new InsertionSort());
		for (int i: v2) {
			System.out.print(i+", ");
		}
		System.out.println("");
		System.out.println("----sorted-----");
		sc.sort(v2);
		for (int i: v2) {
			System.out.print(i+", ");
		}
		System.out.println("");
		
		int[] v3 = { 323, 14, 234, 234, 23, 423, 4, 23, 4, 32, 5, 23, 4, 23, 4, 23, 4, 23, 4, 32, };
		 sc = new SortContext(new SelectionSort());
		for (int i: v3) {
			System.out.print(i+", ");
		}
		System.out.println("");
		System.out.println("----sorted-----");
		sc.sort(v3);
		for (int i: v3) {
			System.out.print(i+", ");
		}
	}

}
