package project.euler.solutions;

import java.math.BigInteger;


public class P25 {
	 public static void main(String[] args) {
	      long t1 = System.currentTimeMillis();
	      BigInteger[] array = new BigInteger[1000000];
	      array[0] = BigInteger.valueOf(1);
	      array[1] = BigInteger.valueOf(1);
	      
	      for (int i=2; i<array.length; i++){
	         array[i] = array[i-1].add(array[i-2]);
	            if (array[i].toString().length() == 1000){
	               System.out.println(i+1);
	               System.out.println(array[i].toString());
	               long t2 = System.currentTimeMillis();
	               System.out.println(t2-t1);
	               break;
	         }
	   }
	   }
}
