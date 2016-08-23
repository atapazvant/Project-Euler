package project.euler.solutions;

import java.math.BigInteger;

public class P056 {

	public static void main(String[] args) {
		int max = 0;
		for (int i = 99; i > 0; i--) {
			for (int j = 99; j > 0; j--) {
				BigInteger bg = BigInteger.valueOf(i).pow(j);
				max = Math.max(max, sumDigit(bg));
			}
		}
		System.out.println(max);
	}

	private static int sumDigit(BigInteger number) {
		int sum = 0;
		String strNumber = number.toString();
		for (int i = 0; i < strNumber.length(); i++) {
			sum += strNumber.charAt(i) - '0';
		}
		return sum;
	}
}
