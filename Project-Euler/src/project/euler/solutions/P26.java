package project.euler.solutions;

public class P26 {

	public static void main(String[] args) {
		
		double x = 1;
		for (int i = 1; i < 1000; i++) {
			System.out.println(i + " : " + (double)x/i);
		}
	}
}
