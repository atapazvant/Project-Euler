package project.euler.solutions;

import java.util.HashSet;

public class P29 {
	
	private static HashSet<Double> set = new HashSet<Double>();
	private static int counter;
	
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();
		
		solve();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time : " + (endTime - startTime) + ", # of elements : " + counter);
	}

	private static void solve() {
		
		for (int i = 2; i <= 100; i++) {
			for(int j = 2; j <= 100; j++) {
				if(set.add(Math.pow(i, j)))
					counter++;
			}
		}
	}
}
