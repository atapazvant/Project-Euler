package project.euler.solutions;

public class P7 {
	public static void main(String[] args) {
		int count = 1; // 2 is prime
		int number = 3;
		
		while(true){
			if(isPrime(number)) {
				System.out.println(number);
				count++;
			}
			if(count == 10001)
				break;
			number += 2;
		}
	}
	
	public static boolean isPrime(int i) {
		for (int j = 3; j < Math.sqrt(i) + 1; j++) {
			if(i % j == 0)
				return false;
		}
		return true;
	}
}
