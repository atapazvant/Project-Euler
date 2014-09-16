package project.euler.solutions;

import java.util.*;

public class P21 {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<Integer>();
		
		for (int i = 2; i <= 10000; i++) {
			int j = i;
			
			int sum = 0;
			for (int k = 1; k <= j / 2; k++) {
				if(j % k == 0)
					sum += k;				
			}		
			
			if(sum == j)
				continue;
			
			int sum2 = 0;
			for (int m = 1; m <= sum / 2; m++) {
				if(sum % m == 0)
					sum2 += m;
			}
			
			if(sum2 == j)
			{
				if(ints.contains(sum2) == false)
					ints.add(sum2);
				if(ints.contains(sum) == false)
					ints.add(sum);
			}
		}		
		
		int sum = 0;
		for (Integer integer : ints) {
			sum += integer;
		}
		System.out.println(sum);
	}
}
