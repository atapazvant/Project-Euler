package project.euler.solutions;

public class P45 {
	
	public static void main(String[] args) {

		  long number;
	      long start = System.currentTimeMillis();
	      for (long i = 286;; i++) {

	         number = (i * (i + 1)) / 2;
	         if ((Math.sqrt(24 * number + 1) + 1) / 6 % 1 != 0) {
	            continue;
	         }
	         if ((Math.sqrt(8 * number + 1) + 1) / 4 % 1 != 0) {
	            continue;
	         }
	         
	         System.out.println(i + " " + number);
	         long end = System.currentTimeMillis();
	         System.out.println(end-start);
	         break;
	         
	      }
	}
}
