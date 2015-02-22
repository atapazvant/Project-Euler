package project.euler.solutions;

public class P52 {
	private int MAX = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		new P52().solve();
	}
	
	public void solve() {
		
		for (int i = 1; i < MAX; i++) {
			
			boolean found = true;
			while (found) {
				
				for (int j = 2; j <= 6; j++) {
					
					if(!isPermuted(i, i * j)) {
						found = false;
						break;
					}					
				}
				
				if(found) {
					System.out.println(i);
					break;
				}
			}
			
			if(found)
				break;
		}		
	}
	
	public boolean isPermuted(int x, int y) {
		
		int[] digits = new int[10];
		while(x > 0) {
			int rm = x % 10;
			digits[rm]++;;
			x /= 10;
		}
		
		while(y > 0) {
			int rm = y % 10;
			digits[rm]--;
			y /= 10;
		}
		
		for (int i = 0; i < digits.length; i++) {
			if(digits[i] > 0)
				return false;
		}
		
		return true;
	}

}
