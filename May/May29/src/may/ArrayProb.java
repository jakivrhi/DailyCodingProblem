package may;

import java.util.Arrays;

public class ArrayProb {

	public static void main(String[] args) {
		
		int[]array = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(arrayMethod(array)));
		
	}
	
	
	public static int[] arrayMethod(int[] array) {
		
		int[] newArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			newArray[i] = 1;
			for (int j = 0 ; j < array.length; j++) {
				if(i != j) {
					newArray[i] *= array[j];
				}
			}
		}
		return newArray;
	}

}
