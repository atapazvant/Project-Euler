package project.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class P47 {	
	public static void main(String[] args) {
		
		int search = 4;
		List<Integer> chain = new ArrayList<Integer>();
		
		for (int i = 1; i < 1000000; i++) {
			if(distinctPrime(i) == search) {
				chain.add(i);
			}
		}
		
	}

	private static int distinctPrime(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
