package project.euler.solutions;

import java.util.Calendar;

public class P19 {

	public static void main(String[] args) {				
		int count = 0;
		Calendar cal = Calendar.getInstance();
        for (int year = 1901; year <= 2000; year++) {
        	for (int month = 1; month <= 12; month++) {
				cal.set(year, month, 1);
				if(cal.getTime().getDay() == 0)
					count++;
			}
		}
        
        System.out.println(count);
	}
}
