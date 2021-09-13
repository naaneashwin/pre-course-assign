package Precourse;

public class L {
	
		public static void main(String[] args) {
			int num = 4265353;
			int m = num/2;
			boolean flag = false;
			
			if (num==2) {
				System.out.println(num + " a prime number");
			}
			else if (num!=2 && num%2==0) {
				System.out.println(num + " not a prime number, the entered number is an even number which is divisible by 2");
			}
			else {
				for(int i = 2; i<=m; i++) {
					if (num%i==0) {
						flag = true;
						break;
					}
				}
				if (flag == true) {
					System.out.println(num+ " is not a prime number");
				}
				else {
					System.out.println(num + " is a prime number");
				}
			}
			
		}
	}

