package Exercicio4_1;

import java.util.HashMap;

@SuppressWarnings("serial")
public class HashMapAdapter extends HashMap<Integer, Integer> {

	public static HashMap<Integer, Integer> matrixToHashMap(int[][] m) {
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int[] i : m) {
			h.put(i[0], i[1]);
		}
		return h;
	}

}
