package project.euler.solutions;

public class P10 {
	public static void main(String[] args) {
		long sum = 2; // 2 is prime
		//findPrimesSum(sum);
		//isPrime(25);
		usingSieve();
	}

	private static void usingSieve() {
		boolean numbers[] = new boolean[2000000];
		int i = 0, j = 0;
		long sum = 0;
				
		for(i = 2; i < 2000000; i++) {
			if(numbers[i])
				continue;
			else
				sum += i;
					
			for(j = i + i; j < 2000000; j += i)
				numbers[j] = true;
		}
				
		System.out.println(sum);
		
	}

	private static void findPrimesSum(long sum) {		
		for (int i = 3; i < 2000000; i++) {
			if(isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int i) {		
		if(i % 2 == 0)
			return false;
		
		for (int j = 3; j < Math.sqrt(i) + 1; j++) {
			if(i % j == 0)
				return false;
		}
		return true;
	}
}
