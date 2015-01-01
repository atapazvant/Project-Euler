package project.euler.solutions;

public class P41 {
	
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void solve() {
	   boolean[] primes = getPrimes(987654321);
       int result = 0;

       for (int i = primes.length - 1; i >= 0; i--) {
           if(primes[i] && isPandigital(i)){
               result = i;
               break;
           }
       } 
       
       System.out.println(result);
	}
	
	private static boolean[] getPrimes(int upperBound) 
	{
		boolean[] isPrime = new boolean[upperBound + 1];
		
		// initially assume all integers are prime
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		// mark non-primes using Sieve method
		for (int i = 2; i * i <= isPrime.length; i++) {			
			if(isPrime[i]) {
				for (int j = i; i * j < isPrime.length; j++) {
					isPrime[i * j] = false;
				}
			}			
		}
		
		return isPrime;
	}
		
	 private static boolean isPandigital(long n) {
         int digits = 0;
         int count = 0;
         int tmp;

         while (n > 0) {
             tmp = digits;
             digits = digits | 1 << (int)((n % 10) - 1); //The minus one is there to make 1 fill the first bit and so on
             if (tmp == digits) { //Check to see if the same digit is found multiple times
                 return false;
             }

             count++;
             n /= 10;
         }

         return digits == (1 << count) - 1;
     }

}
