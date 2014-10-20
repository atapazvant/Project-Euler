package project.euler.solutions;

public class P50 {
	
	public static void main(String[] args) {
		boolean[] s = primeList(1000000);
		int[] sq = primeIntegerList(1000000);
		
		
		long max = 0L;
		int maxCounter = -1;
		for (int i = 0; i < sq.length; i++) {			
			int sum = 0;
			for (int j = i; j < sq.length; j++) {
				sum += sq[j];
				if(sum > 1000000)
					break;
				else if(j - i > maxCounter && sum > max && s[sum]) {
					max = sum;
					maxCounter = j - i;
				}
			}
		}
				
		System.out.println(Long.toString(max));
	}
	
	
	public static boolean[] primeList(int n) {		
		if(n < 0)
			throw new IllegalArgumentException();
		
		boolean[] lPrimes = new boolean[n + 1];
		
		if(n >= 2)
			lPrimes[2] = true;
		
		for (int i = 3; i <= n; i+=2) {
			lPrimes[i] = true;
		}		
		
		for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
			if (lPrimes[i]) {
				for (int j = i * i; j <= n; j += i << 1)
					lPrimes[j] = false;
			}
		}
		
		return lPrimes;
	}
	
	public static int[] primeIntegerList(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		
		boolean[] bList = primeList(n);
		int count = 0;
		for (boolean b : bList) {
			if(b)
				count++;
		}
		
		int[] primes = new int[count];
		
		for (int i = 0, j = 0; i < bList.length; i++) {
			if(bList[i]) {				
				primes[j] = i;
				j++;
			}
		}
		
		return primes;
	}
}
