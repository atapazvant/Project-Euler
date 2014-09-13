package project.euler.solutions;

import java.util.Iterator;

public class P76 {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();		
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void Solve() {
		
		int w = 100;
		int[] results = new int[w + 1];
		results[0] = 1;
		
		for (int i = 1; i < w; i++) {
			for (int j = i; j <= w; j++) {
				results[j] += results[j - i];
			}
		}
		System.out.println("Sln : " + results[100]);
	}
}
