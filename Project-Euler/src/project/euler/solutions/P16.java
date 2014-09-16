package project.euler.solutions;

import java.math.BigInteger;

public class P16 {

	public static void main(String[] args) {
		String number = BigInteger.ONE.shiftLeft(1000).toString();
		
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += (int)number.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
