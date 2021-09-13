package Precourse;

public class Prime_num {

	public static void main(String[] args) {
		int num = 4265353;
		int m = num/2;
		boolean flag = false;
		int i = 2;
		
		if (num==2) {
			System.out.println(num + " a prime number");
		}
		else if (num!=2 && num%2==0) {
			System.out.println(num + " not a prime number, the entered number is an even number which is divisible by 2");
		}
		else {
			while (i<=m) {
				if (num%i==0) {
					flag = true;
					break;
				}
				i++;
			}
			if (flag == true) {
				System.out.println(num+ " is not a prime number as it is divisible by "+i);
			}
			else {
				System.out.println(num + " is a prime number");
			}
		}
		
	}
}