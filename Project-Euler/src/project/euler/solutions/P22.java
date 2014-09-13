package project.euler.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P22 {

	private static List<String> items;
	private static ArrayList<Integer> points = new ArrayList<Integer>(); 
	private static long totalSum = 0;
	
	public static void main(String[] args) throws IOException {
		long stime = System.currentTimeMillis();
		
		Solve();
		
		long etime = System.currentTimeMillis();
		
		System.out.println("total time : " + (etime - stime) + ", result : " + totalSum);
	}

	private static void Solve() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\atap\\Github\\testFirst\\bin\\euler\\keserix\\p22.txt"));
		String line;
		
		while((line = br.readLine()) != null) {
			items = Arrays.asList(line.split(","));
		}
		
		Collections.sort(items);
		
		for (int i = 0; i < items.size(); i++) {
			int sum = 0;
			for(char c : items.get(i).toCharArray()) {
				if(c != '"')
					sum += (int)c-64;
			}
			totalSum += (i + 1)*sum;
		}			
	}
}
