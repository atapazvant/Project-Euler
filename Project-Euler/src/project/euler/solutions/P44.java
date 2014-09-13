package project.euler.solutions;

public class P44 {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();		
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void Solve() {
		int result = 0;
        boolean notFound = true;            
        int i = 1;
        int k = 0;

        while (notFound) {
            i++;
            int n = i * (3 * i - 1) / 2;
            
            for (int j = i-1; j > 0; j--) {
                int m = j * (3 * j - 1) / 2;
                if (isPentagonalNumber(n - m) && isPentagonalNumber(n + m)) {
                    result = n-m;
                    k = j;
                    notFound = false;
                    break;
                }
            }
        }
        System.out.println(i + " " + k);
        System.out.println(result);
	}
	
	public static boolean isPentagonalNumber(int n) {
		double x = (Math.sqrt(n*24 + 1) + 1) / 6;
		return x % 1 == 0;
	}
}
