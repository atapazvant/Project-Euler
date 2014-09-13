package project.euler.solutions;

import java.util.*;

public class P50 {
	
	private static List<Integer> list = new ArrayList<Integer>();
	private static List<Integer> filteredlist = new ArrayList<Integer>();
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

		private static void Solve() {
			boolean result;
			for(int i = 2; i < 1000; i++){
				result = IsPrime(i);
				if(result){
					//System.out.println(i);
					list.add(i);					
				}			
			}
			
			int sum = 0;
			for(int i = 0; i < list.size(); i++) {
				sum += list.get(i);
				if(list.contains((int)sum)) {
					System.out.println("sum : " + sum);
					filteredlist.add(sum);
				}
			}
			
			for(int i = 0; i < filteredlist.size(); i++){
				System.out.println("filtered sum : " + filteredlist.get(i));
			}
			
			//System.out.println(list.size());
	}

		private static boolean IsPrime(int i) {
			if(i == 2 || i == 3)
				return true;
			if(i % 2 == 0)
				return false;
			for(int k = 3; k <= Math.sqrt(i); k+=2){
				if(i % k == 0)
					return false;
			}
			return true;
		}
}
