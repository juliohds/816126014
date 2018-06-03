package Exercicio7_2;

import java.util.Comparator;

public class ComparatorDoubles implements Comparator {

	public ComparatorDoubles() {};
	public void run(double[] d) {
		System.out.println("Entendi foi nada desse exercício");
		int[] i = new int[d.length];
		for (int x = 0; x<i.length; x++) {
			i[x] = (int) d[x];
		}
		if (compare(d,i) == 1) {
			System.out.println("São Iguais");
		}else {
			System.out.println("Há Diferenças");
		}
		
		System.out.print(i[0]);
		for (int x = 1; x<i.length; x++) {
			System.out.print(", "+d[x]);
		}

	}

	@Override
	public int compare(Object a, Object b) {
		int result = 1;
		double[] d = (double[]) a;
		int[] i = (int[]) b;
		for (int x = 0; x<d.length; x++) {
			if (i[x] !=  d[x] ) {
				result = 0;
			}
		}
		
		return result;
	}
}