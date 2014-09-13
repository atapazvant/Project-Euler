package project.euler.solutions;

public class P5 {

	public static void main(String[] args) {
		long k = 1;
		for (int i = 2; i <= 20; i++) {
			k = lcm( k , i);
		}
		
		System.out.println(k);
	}
	
	public static long gcd(long i, long j) {
		while (j > 0) {
			long temp = j;
			j = i % j;
			i = temp;
		}
		return i;
	}
	
	public static long lcm(long i, long j) {
		return (i * j) / gcd(i, j);
	}
}
