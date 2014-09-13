package project.euler.solutions;


import java.util.*;

public class P47 {

	private static int[] primeList;
	public static void main(String[] args) {
		
		 int upperBound = 100000;		
		 primeList = Sieve(upperBound);
		
		 int targetpf = 4;
	     int targetConsec = 4;
	     int consec = 1;
	     int result = 2 * 3 * 5 *7;
	
	     while (consec < targetConsec) {
	         result++;
	
	         if (NumberOfPrimeFacors(result) >= targetpf) {
	             consec++;
	         } else {
	             consec = 0;
	         }
	     }       
	     
	     System.out.println(targetConsec);
	     System.out.println(targetpf);
	     System.out.println(result-targetConsec+1);
	}
	
	private static int NumberOfPrimeFacors(int number) {
        int nod = 0;
        boolean pf;
        int remain = number;

        for (int i = 0; i < primeList.length; i++) {

            // In case there is a remainder this is a prime factor as well
            // The exponent of that factor is 1
            if (primeList[i] * primeList[i] > number) {
                return ++nod;
            }

            pf = false;
            while (remain % primeList[i] == 0) {
                pf = true;
                remain = remain / primeList[i];
            }
            if (pf){
                nod++;
            }
            
            //If there is no remainder, return the count
            if (remain == 1) {
                return nod;
            }
        }
        return nod;
    }

	private static int[] Sieve(int upperBound) {
		List<Integer> primeList = new ArrayList<Integer>();
		boolean []table = new boolean[upperBound + 1];
	    for (int i = 2; i <= Math.sqrt(upperBound); i++) {
	    	if(table[i] == false)
	    	{
	    		for (int j = i * i; j <= upperBound; j += i) {
					table[j] = true;
				}
	    	}
		}
	    
	    for(int i = 2; i < upperBound; i++) {
	    	if(table[i] == false)
	    		primeList.add(i);
	    }
	    return toArray(primeList);
	}
	
	 public static int[] toArray(Collection<? extends Number> collection) {		   
		    Object[] boxedArray = collection.toArray();
		    int len = boxedArray.length;
		    int[] array = new int[len];
		    for (int i = 0; i < len; i++) {
		      array[i] = ((Number) boxedArray[i]).intValue();
		    }
		    return array;
		  }	
}
