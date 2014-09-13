package project.euler.solutions;

public class P2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; ; i++) {			
			int fib = findFib(i);
			if(fib > 4000000)
				break;
			else if( fib % 2 == 0)
				sum += fib;
		}
		
		System.out.println(sum);
	}
	
	static int findFib(int fib) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < fib; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
}
