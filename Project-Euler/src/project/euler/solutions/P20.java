package project.euler.solutions;

import java.math.BigInteger;

public class P20 {

	public static void main(String[] args) {
		BigInteger integer = BigInteger.ONE;
		String s = "";
		for (int i = 1; i <= 100; i++) {
			s = String.valueOf(i);
			integer = integer.multiply(new BigInteger(s));	
		}
		
		int sum = 0;
		String rep = integer.toString();
		for (int i = 0; i < rep.length(); i++) {
			sum += Integer.parseInt(rep.substring(i, i + 1));
		}
		
		System.out.println(sum);
	}
}
