package project.euler.solutions;

import java.math.BigInteger;

public class p53 {

	public static void main(String[] args) {
		System.out.println(solutionOne());
	}
	
	public static int solutionOne() {
		BigInteger million = BigInteger.TEN.pow(6);
		int upperBound = 100;
		int result = 0;
		
		BigInteger[] facs = factorial(100);
		
		for (int i = 1; i <= upperBound; i++) {
			for (int j = 0; j <= i; j++) {
				if(facs[i].divide((facs[i - j].multiply(facs[j]))).compareTo(million) > 0)
					result++;
			}
		}
		
		return result;
	}

	private static BigInteger[] factorial(int x) {
		 if (x < 0) return null;
         
         BigInteger[] y = new BigInteger[x + 1];
         y[0] = BigInteger.ONE;
                    
         for (int i = 1; i <= x; i++) {
             y[i] = y[i-1].multiply(new BigInteger(String.valueOf(i)));                
         }

         return y;
	}
}
