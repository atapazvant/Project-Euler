package project.euler.solutions;

import java.util.ArrayList;

public class P35 {

	ArrayList<Integer> lstOfPrimes = new ArrayList<Integer>();
	public static void main(String[] args) {
		
		new P35().findPrimes(100);
		
		
	}
	
	private void findPrimes(int upperBound) {		
		for (int i = 2; i < upperBound; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i) + 1; j++) {			
				if(i % j == 0 && (i != 2)) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				lstOfPrimes.add(i);
				System.out.println(i + " ");
			}
		}		
	}
}
