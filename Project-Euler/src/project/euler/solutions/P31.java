package project.euler.solutions;

public class P31 {
	private static int counter;
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		solve();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time : " + (endTime - startTime) + " count: " + counter);
	}

	
	private static void solve() {
		int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 200};
		
		//counter = solveBrute();
		counter = countDP(coins, 8, 200);		
		//counter = count(coins, 8, 200);
	}

	// Recursive sln
	private static int count(int[] coins, int m, int n) {
		if(n == 0)
			return 1;
		if(n < 0)
			return 0;
		if(m <= 0 && n >= 1)
			return 0;
		
		return count(coins, m-1, n) + count(coins, m, n - coins[m - 1]);
	}
	
	// dynamic programming
	private static int countDP(int[] coins, int m, int n) {
		int[] table = new int[n + 1];
		
		table[0] = 1;
		
		for(int i = 0; i < m; i++)
			for(int j = coins[i]; j <= n; j++)
				table[j] = table[j] + table[j - coins[i]];
		
		return table[n];
	}
	
	public static int solveBrute()
    {
        int combinations = 0;
        int Sum=200;

        for (int P2 = 0; P2 <= Sum; P2 += 200)
            for (int P1 = P2; P1 <= Sum; P1 += 100)
                for (int p50 = P1; p50 <= Sum; p50 += 50)
                    for (int p20 = p50; p20 <= Sum; p20 += 20)
                        for (int p10 = p20; p10 <= Sum; p10 += 10)
                            for (int p5 = p10; p5 <= Sum; p5 += 5)
                                for (int p2 = p5; p2 <= Sum; p2 += 2)
                                    combinations++;
        return combinations;
    }
}
