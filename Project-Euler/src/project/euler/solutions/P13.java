package project.euler.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class P13 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("p13.txt"));
		
		BigInteger sum = BigInteger.ZERO;
		String line = "";
		while ((line = reader.readLine()) != null) {
			BigInteger number = new BigInteger(line);
			sum = sum.add(number);
		}
		
		System.out.println(sum.toString().substring(0, 10));
	}
}
