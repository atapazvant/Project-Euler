package project.euler.solutions;


public class P30 {
	public static void main(String[] args) {		
		solve();
	}
	
	public static void solve() {
		int answer = 0;
		 
		for(int i = 10; i < 9999999; i++) {
		   int[] digits = ConvertToArrayOfDigits(i);
		 
		   long sum = 0;
		   for(int j = 0; j < digits.length; j++) {
		      sum += Math.pow(digits[j], 5);
		      //too high, move to next number;
		      if(sum > i) {
		         break;
		      }
		   }
		   if(sum == i) {
		      answer += sum;
		   }
		}
		 
		System.out.println("Answer: "+answer);
	}
	
	public static int[] ConvertToArrayOfDigits(int value)
	{
	    int size = DetermineDigitCount(value);
	    int[] digits = new int[size];
	    for (int index = size - 1; index >= 0; index--)
	    {
	        digits[index] = value % 10;
	        value = value / 10;
	    }
	    return digits;
	}

	private static int DetermineDigitCount(int x)
	{
	    // This bit could be optimised with a binary search
	    return x < 10 ? 1
	         : x < 100 ? 2
	         : x < 1000 ? 3
	         : x < 10000 ? 4
	         : x < 100000 ? 5
	         : x < 1000000 ? 6
	         : x < 10000000 ? 7
	         : x < 100000000 ? 8
	         : x < 1000000000 ? 9
	         : 10;
	}
}