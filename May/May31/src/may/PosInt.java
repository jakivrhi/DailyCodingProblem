package may;

import java.util.Arrays;

public class PosInt {

	public static void main(String[] args) {
		
		//TEST
		int[]arr1 = new int[] {3, 4, -1, 1};
		int number1 = findPositive(arr1);
		System.out.println(number1 + "");
		
		int[]arr2 = new int[] {1, 2, 0};
		int number2 = findPositive(arr2);
		System.out.println(number2 + "");
		
		int[]arr3 = new int[] {-10, -7, -8 , -9, -88};
		int number3 = findPositive(arr3);
		System.out.println(number3 + "");
		
		int[]arr4 = new int[] {1, 2, -2, -10, 10};
		int number4 = findPositive(arr4);
		System.out.println(number4 + "");
	}
	
	public static int findPositive (int[] arr) {
		
		int max = arr[0];
		int min = Integer.MAX_VALUE;
		 
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min && arr[i] > 0) {
				min = arr[i];
			}
		}
		if(min > max) {
			min = -1;
		}
		
		if(min >= 2) {
			return (min - 1);
		}
		
		//getting our array sorted
		Arrays.sort(arr);
        
        for(int i = 0; i < arr.length-1; i++) {
        	if(arr[i] >= 1) {
	        	if(arr[i + 1] - arr[i] >= 2) {
	        		return arr[i] + 1;
	        	}
        	}
        }
        
        if(max >= 1) {
        	return max + 1;
        }
        return 1;
	}

}
