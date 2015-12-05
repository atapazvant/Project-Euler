package project.euler.solutions;

import java.util.ArrayList;

public class P32 {

	public static void main(String[] args) {	
		int counter = 0;
		ArrayList<Integer> products = new ArrayList<Integer>();
                for(int i=1; i<=9999; i++) {
			Break:
				for(int j=1; j<=1000; j++) {
					int product = i*j;
					String current = Integer.toString(i) + Integer.toString(j) + Integer.toString(product);
					if(current.length() > 9) {
						break Break;
					}
					Boolean add = search(current);
					if(add) {
						if(!(products.contains(product))) {
							products.add(product);
							counter += product;
						}
					}
				}
		}
		
		System.out.println(counter);
	}

	static Boolean search(String x) {
		Boolean value = false;

		if(x.contains("1") && x.contains("2") && x.contains("3") && x.contains("4") && x.contains("5") && x.contains("6") 
				&& x.contains("7") && x.contains("8") && x.contains("9") )
			value = true;
		return value;
	}
}
