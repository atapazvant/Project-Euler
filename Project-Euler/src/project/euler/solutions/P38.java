package project.euler.solutions;

public class P38 {

	public static void main(String[] args) {
		long result = 0;
        for (long i = 10000; i >= 9000; i--) {
            result = concat(i, 2*i);
            if(isPandigital(result)){  
            	System.out.println(i);
                break;
            }
        }
        
        System.out.println(result);
	}
	
    private static long concat(long i, long l) {
		long tmp = l;
		
		while(tmp > 0) {
			i *= 10;			
			tmp /= 10;
		}
		
		return i + l;
	}

	private static boolean isPandigital(long n) {
        int digits = 0;
        int count = 0;
        int tmp;

        while (n > 0) {
            tmp = digits;
            digits = digits | 1 << (int)((n % 10) - 1); //The minus one is there to make 1 fill the first bit and so on
            if (tmp == digits) { //Check to see if the same digit is found multiple times
                return false;
            }

            count++;
            n /= 10;
        }

        return digits == (1 << count) - 1;
    }

}
