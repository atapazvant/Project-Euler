package project.euler.solutions;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class P46 {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		
		Solve();		
		
		long eTime = System.currentTimeMillis();
		
		System.out.println("total time : " + (eTime - sTime));
	}

	private static void Solve() {
		boolean iterate = true;
		int i = 33;
		while (iterate) {
			i += 2;
			
			
		}		
	}
	/* 
	public int[] ESieve(int upperLimit) {

        int sieveBound = (int)(upperLimit - 1) / 2;
        int upperSqrt = ((int)Math.sqrt(upperLimit) - 1) / 2;

        BitSet PrimeBits = new BitSet(sieveBound + 1, true);

        for (int i = 1; i <= upperSqrt; i++) {
            if (PrimeBits.Get(i)) {
                for (int j = i * 2 * (i + 1); j <= sieveBound; j += 2 * i + 1) {
                    PrimeBits.Set(j, false);
                }
            }
        }

        List<Integer> numbers = new ArrayList<Integer>((int)(upperLimit / (Math.log(upperLimit) - 1.08366)));
        numbers.add(2);
        for (int i = 1; i <= sieveBound; i++) {
            if (PrimeBits.Get(i)) {
                numbers.add(2 * i + 1);
            }
        }

        return numbers;
    }
    */
}
