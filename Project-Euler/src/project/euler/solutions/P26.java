package project.euler.solutions;

import java.util.ArrayList;

public class P26 {

	public static void main(String[] args) {
		
		solve();
	}

	private static void solve() {
		
		int constant = 0;
		int max = 0;
		int num = 0;
		int count = 1;
		for (int i = 2; i < 1000; i++) {
			
			ArrayList<Integer> listOfDivs = new ArrayList<Integer>();			
			constant = 10;
			count = 0;
			while (constant % i != 0) {
				
				int sx = constant % i;				
				if (listOfDivs.contains(sx)) {
					break;
				}
				
				listOfDivs.add(sx);				
				constant = sx;
				constant = constant * 10;
				count++;
				
				if(count > max) {
					max = count;
					num = i;
				}
				
				max = Math.max(max, count);
			}
		}
		
		System.out.println(String.format("%s - %s", max, num));
	}
}
