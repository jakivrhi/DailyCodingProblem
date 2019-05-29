package may;

public class NumberList {

	public static void main(String[] args) {
		
		// TEST
		int[] array = new int[] {10, 15 ,3, 7};
		
		int number = 17;
		
		if(exist(array, number)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
	}

	public static boolean exist(int[] array, int number) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i != j) {
					if(array[i] + array[j] == number) {
						return true;
					}
				}
			}
		}
		return false;
	}
		
}
