package MockPrep;

import java.util.Arrays;
import java.util.Random;

public class Arrayshuffle {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random rand = new Random();
		
		for (int i = 0; i < a.length; i++) {
			int j = rand.nextInt(a.length);
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		
		System.out.println("Shuffle is:"+Arrays.toString(a));
	}
}
