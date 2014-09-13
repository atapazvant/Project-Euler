package project.euler.solutions;

import java.util.*;

public class P49 {
	
	private static List<Integer> primeList = new ArrayList<Integer>();
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}
	
	private static void Solve() {
		boolean result;
		for(int i = 1001; i < 9999; i+=2){
			result = IsPrime(i);
			if(result){
				primeList.add(i);
				//System.out.println(i);
				}			
		}
		FindTriples(primeList);
	}

	private static void FindTriples(List<Integer> primeList ) {
		for (int i = 0; i < primeList.size(); i++) {
			int val = primeList.get(i);
			int val1 = val + 3330;
			int val2 = val + 6660;
			
			int s_val = val / 10;
			int s_val1 = val1 / 10;
			int s_val2 = val2 / 10;
			
			char[] c0 = String.valueOf(s_val).toCharArray();
			char[] c1 = String.valueOf(s_val1).toCharArray();
			char[] c2 = String.valueOf(s_val2).toCharArray();

			int t1 = 0;
			for (int j = 0; j < c0.length; j++) {
				t1 = t1 + Integer.parseInt(String.valueOf(c0[j]));
			}
			
			int t2 = 0;
			for (int j = 0; j < c1.length; j++) {			
				t2 = t2 + Integer.parseInt(String.valueOf(c1[j]));
			}
			
			int t3 = 0;
			for (int j = 0; j < c2.length; j++) {	
				t3 = t3 + Integer.parseInt(String.valueOf(c2[j]));
			}
			
			// print out all the possible results and then among them, choose the asked one with same digit property.
			if((t1 == t2) && (t1 == t3) && primeList.contains((int)val2) && primeList.contains((int)val1))
				System.out.println(val + ", " + val1 + ", " + val2);
		}
	}

	private static boolean IsPrime(int i) {
		for(int k = 3; k < Math.sqrt(i); k+=2) 
		{
			if(i % k == 0)
				return false;
		}
		return true;
	}
}
