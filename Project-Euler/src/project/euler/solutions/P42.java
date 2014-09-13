package project.euler.solutions;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42 {
	private static Map<Character, Integer> listOfAlph = new HashMap<Character, Integer>();
	private static final String filePath = "E:\\DEVELOPMENT\\GIT\\testFirst\\testFirst\\bin\\euler\\keserix\\words.txt";
	private static List<String> listofWords = new ArrayList<String>();
	private static List<Integer> listOfCorrespondingValues = new ArrayList<Integer>();
	private static int counter;
	
/*	static
	{
		listOfAlph.put('A', 1);
		listOfAlph.put('B', 2);
		listOfAlph.put('C', 3);
		listOfAlph.put('D', 4);
		listOfAlph.put('E', 5);
		listOfAlph.put('F', 6);
		listOfAlph.put('G', 7);
		listOfAlph.put('H', 8);
		listOfAlph.put('I', 9);
		listOfAlph.put('J', 10);
		listOfAlph.put('K', 11);
		listOfAlph.put('L', 12);
		listOfAlph.put('M', 13);
		listOfAlph.put('N', 14);
		listOfAlph.put('O', 15);
		listOfAlph.put('P', 16);
		listOfAlph.put('Q', 17);
		listOfAlph.put('R', 18);
		listOfAlph.put('S', 19);
		listOfAlph.put('T', 20);
		listOfAlph.put('U', 21);
		listOfAlph.put('V', 22);
		listOfAlph.put('W', 23);
		listOfAlph.put('X', 24);
		listOfAlph.put('Y', 25);
		listOfAlph.put('Z', 26);
	}*/
	
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
					//sum += listOfAlph.get(c).intValue();
					sum += (int)c - 64;
			}
			listOfCorrespondingValues.add(sum);
			//System.out.println(sum);					
		}
	}

	public static void readWords() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    
	    for(String word : reader.readLine().split(",")) {
	    	listofWords.add(word.trim());
	    }
	}
}
