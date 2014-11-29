package project.euler.solutions;

import java.util.ArrayList;
import java.util.List;


public class P46 {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void Solve() {
		int[] pList = ESieve(10000);
		
		int odd = 1;
		boolean found = true;
		
		while (found) {
			odd += 2;
			int i = 0;
			found = false;
			
			while(odd >= pList[i])
			{
				double x = (odd - pList[i]) / 2;
				if(checkTwice(x))
				{
					found = true;
					break;
				}
				i++;
			}			
		}
		System.out.println(odd);
	}
	
	private static boolean checkTwice(double x) {
		double sqrt = Math.sqrt(x);
		return sqrt == (int)sqrt;
	}

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
