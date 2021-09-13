package Precourse;

public class Sum_of_N_numbers {

	public static void main(String[] args) {
		int arr[] = {1,3,9,5,6,445,485,87,659,245,456};
		int l = arr.length;
		int sum=0;
		for (int i=0; i<l ;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
