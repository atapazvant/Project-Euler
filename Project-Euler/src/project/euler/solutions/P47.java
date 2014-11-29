package project.euler.solutions;

public class P47 {	
	public static void main(String[] args) {		
		
		for (int i = 1000; i < 1000000; i++) {			
			
			if(haveFourDivisors(i) && haveFourDivisors(i + 1) && haveFourDivisors(i + 2) && haveFourDivisors(i + 3))
			{
				System.out.println(i);
				break;
			}
		}
				
		System.out.println();
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	private static boolean haveFourDivisors(int number)
	{		
		int count = 0;	
		for (int i = 2; i <= number; i++) {
			
			boolean divisor = false;
			while(number % i == 0)
			{
				if(!divisor)
					count++;
				divisor = true;				
				number = number / i;
			}
			
		}
		
		return count == 4;
	}
}
