package project.euler.solutions;

public class P6 {

	public static void main(String[] args) {
		int j = 50*101;
		long d = (long)Math.pow(j, 2);
		
		long sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += (long)Math.pow(i, 2);
		}
		
		System.out.println(d - sum);
	}
}
