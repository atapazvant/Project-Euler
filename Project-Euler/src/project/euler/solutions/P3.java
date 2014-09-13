package project.euler.solutions;

public class P3 {

	public static void main(String[] args) {
		long t = 600851475143L;
		
		for (long i = (long) Math.sqrt(t) - 1;  ; i--) {
			if(i % 2 == 0)
				continue;
			else if(isPrime(i) && t % i == 0)
			{
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean isPrime(long number) {
		boolean isPrime = true;
		for (int i = 3; i < Math.sqrt(number); i++) {
			if(number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}
