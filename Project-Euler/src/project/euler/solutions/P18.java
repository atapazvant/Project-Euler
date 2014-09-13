package project.euler.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P18 {
	private static int heightOfTree = 100;
	private final String fileName = "file\\p18.txt";
	private int[][] tree;
	private BufferedReader bufferedReader;

	
	public int maxValue() throws IOException {
		formTree();
		
		for (int i = P18.heightOfTree - 2; i >= 0; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				tree[i][j] += Math.max(tree[i + 1][j], tree[i + 1][j + 1]);
			}
		}
		return tree[0][0];
	}

	private void formTree() throws IOException {
		tree = new int[P18.heightOfTree][];

		bufferedReader = new BufferedReader(new FileReader(fileName));
		for (int i = 0; i < P18.heightOfTree; i++) {
			tree[i] = new int[i + 1];			
			String fullLine = bufferedReader.readLine();
			
			if(fullLine != "" && fullLine != null){								
				String[] values = fullLine.split(" ");
				for (int j = 0; j <= i; j++)
					tree[i][j] = Integer.parseInt(values[j]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(new P18().maxValue());
	}
}