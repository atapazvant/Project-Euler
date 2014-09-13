 package project.euler.solutions;

import java.math.BigInteger;

public class P48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long sTime = System.currentTimeMillis();
		
		solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void solve() {
		BigInteger val = BigInteger.ZERO;
		for (int i = 1; i <= 1000; i++) {
			val = val.add(BigInteger.valueOf(i).pow(i));
		}
		System.out.println(val);
	}
}
