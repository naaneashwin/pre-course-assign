package Precourse;

public class Largest_of_N_num {
	public static void main(String[] args) {
		int arr[] = {1,2,8,5,9,21,663,878,642,67852,564685,4522524};
		int max = 0;
		for (int i=0; i<arr.length-1 ; i++) {
			if  (arr[i] < arr[i+1]) {
				max = arr[i+1];
			}
			else {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
