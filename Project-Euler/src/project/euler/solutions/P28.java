package project.euler.solutions;


/**
 * f(m) = 4*(2m+1)(2m+1) - 12m;
 * @author atap
 *
 */
public class P28 {
	public static void main(String[] args) {
		long sum = 1; 
		
		for (int n = 3; n <= 1001; n += 2)
			sum += 4 * n * n - 6 * (n - 1);
		
		System.out.println(sum);
	}
}
