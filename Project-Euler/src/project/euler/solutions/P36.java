package project.euler.solutions;

public class P36 {

	private String[] palindromB10;
	private String[] palindromB2;
	
	public static void main(String[] args) {
		P36 problem = new P36();
		problem.solve();
	}
	
	
	public P36() {
		palindromB10 = new String[1000000];
		palindromB2 = new String[1000000];
		initialize();
	}
	
	private void initialize() {
		for (int i = 0; i < 1000000; i++) {
			palindromB10[i] = String.valueOf(i);
			palindromB2[i] = Integer.toBinaryString(i);
		}
	}

	
	public void solve()
	{
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			if(isPalindrom(palindromB10[i]) && isPalindrom(palindromB2[i]))
			{
				sum += Integer.parseInt(palindromB10[i]);
			}
		}
		System.out.println(sum);
	}

	public boolean isPalindrom(String value)
	{
		char[] temp = value.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] != temp[temp.length - 1 - i])
				return false;
		}
		
		return true;
	}
}
