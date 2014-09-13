package project.euler.solutions;

public class P34 {

	public static int counter = 0;
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();
		System.out.println(counter);
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void Solve() {		
		for(int j = 11; j < 100000; j++) {
			int sum = 0;
			int i = j;
			while( (double)i / 10 > 0) {
				int l = i % 10;
				sum += SumFactor(l);
				i = i / 10;
			}
			if(j == sum) {
				System.out.println(j);
				counter++;
			}
		}
	}

	private static int SumFactor(int l) {
		int m = 1;
		while(l > 0) {
			m *= l;
			l--;
		}
		return m;
	}
}
