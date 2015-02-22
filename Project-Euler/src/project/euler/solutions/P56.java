package project.euler.solutions;

import java.math.BigInteger;

public class P56 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 99; i > 0; i--) {
			BigInteger bigInt = new BigInteger(String.valueOf(i));			
			for (int j = 99; j > 0; j--) {
				BigInteger decInt = bigInt.pow(j);
				int result = sumDigit(decInt);
				if(result > sum)
					sum = result;				
			}
		}
		
		System.out.println(sum);		
	}
	
	private static int sumDigit(BigInteger number) {
		int sum = 0;
		char[] digits = number.toString().toCharArray();
		for (int i = 0; i < digits.length; i++) {
			sum += Integer.parseInt(String.valueOf(digits[i]));
		}
		
		return sum;
	}
}
