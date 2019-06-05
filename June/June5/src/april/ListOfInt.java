package april;

public class ListOfInt {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 1, 1, 5};
		int[] arr1 = new int[] {2, 4, 6, 2, 5};
		System.out.println(findSumAdjacent(arr));
		System.out.println(findSumAdjacent(arr1));
	}

	public static int findSumAdjacent(int[] arr) {
		
		int incl, excl, temp;
		
		incl = arr[0];
		excl = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(excl + arr[i] >= incl) {
				temp = incl;
				incl = excl + arr[i];
				excl = temp;
			}else {
				excl = incl;
			}
		}
		return incl;
	}
	
}
