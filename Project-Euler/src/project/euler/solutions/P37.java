package project.euler.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P37 {
	private static int UPPERBOUND = 1000000;
	static int[] primeList;
	
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}
	
	
	private static void Solve()
	{
		primeList = ESieve(UPPERBOUND);
		int count = 0;
		int sum = 0;
		
		int i = 4;
		while(count < 11)
		{
			 int rightTrunk = primeList[i];
             int leftTrunk = 0;
             int multiplier = 1;
             boolean isTrunkPrime = true;

             while (rightTrunk > 0 && isTrunkPrime) {
                 leftTrunk += multiplier * (rightTrunk % 10);
                 isTrunkPrime = isPrime(leftTrunk) && isPrime(rightTrunk);

                 rightTrunk /= 10;
                 multiplier *= 10;
             }

             if (isTrunkPrime) {
                 count++;
                 sum += primeList[i];
             }
             i++;
		}
		
		System.out.println(sum);
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	private static boolean isPrime(int number) {
		return Arrays.binarySearch(primeList, number) >= 0;
	}
	
	/**
	 * 
	 * @param upperbound
	 * @return
	 */
	public static int[] ESieve(int upperbound)
	{
		List<Integer> primes = new ArrayList<Integer>();	
		boolean[] numbers = new boolean[upperbound];
		
		for (int i = 2; i < upperbound; i++) {
			for(int j = 2; j <= upperbound / i; j++)
			{
				if(i * j < upperbound)
					numbers[i * j] = true;
			}
		}
		
		for (int i = 2; i < numbers.length; i++) {
			if(numbers[i] == false)
				primes.add(i);
		}
					
		return toIntArray(primes);
	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	private static int[] toIntArray(List<Integer> list){
	    int[] ret = new int[list.size()];
	    for(int i = 0;i < ret.length;i++)
	      ret[i] = list.get(i);
	    return ret;
	}	
}
