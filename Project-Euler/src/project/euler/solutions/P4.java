package project.euler.solutions;

public class P4 {

	public static void main(String[] args) {
		int value = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (isPalindrome(prod) && prod > value)
					value= prod;
			}
		}
		
		System.out.println(value);
	}

	private static boolean isPalindrome(int number) {
		
		int j = number;
		int sum = 0;
		while(j > 0) {
			int t = j % 10;
			sum = sum * 10 + t;
			j = j / 10;
		}	
		
		return sum == number;
	}
}
