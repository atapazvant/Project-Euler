package project.euler.solutions;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42 {
	private static Map<Character, Integer> listOfAlph = new HashMap<Character, Integer>();
	private static final String filePath = "p42";
	private static List<String> listofWords = new ArrayList<String>();
	private static List<Integer> listOfCorrespondingValues = new ArrayList<Integer>();
	private static int counter;	
	
	public static void main(String[] args) throws IOException{
		long startTime = System.currentTimeMillis();
		readWords();
		
		solve();
		
		triangularCheck();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time : " + (endTime - startTime) + " miliseconds.");
	}
	
	private static void triangularCheck() {
		for(int i: listOfCorrespondingValues){
			double value = Math.floor(Math.sqrt(8*i + 1));
			if(value*value == 8*i + 1)
			{
				counter++;
			}
		}
		System.out.println("# of triangular numbers are " + counter);
	}

	private static void solve() {
		for (int i = 0; i < listofWords.size(); i++) {
			String word = listofWords.get(i);	
			int sum = 0;
			for (Character c : word.toCharArray()) {
				if(c != '"')					
					sum += (int)c - 64;
			}
			listOfCorrespondingValues.add(sum);
			
		}
	}

	public static void readWords() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    
	    for(String word : reader.readLine().split(",")) {
	    	listofWords.add(word.trim());
	    }
	}
}
