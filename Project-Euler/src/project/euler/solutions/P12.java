package project.euler.solutions;

public class P12 {

	public static void main(String[] args) {
		  int number = 0;
	      int i = 1;
	
	      while(countDivisors(number) < 500){
	          number += i;
	          i++;
	      }
	      System.out.println(number);
    }

	private static int countDivisors(int number) {
		int nod = 0;
        int sqrt = (int) Math.sqrt(number);

        for(int i = 1; i<= sqrt; i++){
            if(number % i == 0){
                nod += 2;
            }
        }
        //Correction if the number is a perfect square
        if (sqrt * sqrt == number) {
            nod--;
        }
                    
        return nod;
	}
}
