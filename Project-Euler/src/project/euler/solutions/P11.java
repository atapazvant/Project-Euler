package project.euler.solutions;

import java.io.*;

public class P11 {

	public static void main(String[] args) throws Exception {
		solve();
		
	}

	private static void solve() throws Exception {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("p11.txt")));
			
			int matrix[][] = new int[20][20];								
			for (int i = 0; i < 20; i++) {
				String[] ss = br.readLine().split(" ");				
				for (int j = 0; j < ss.length; j++) {					
					matrix[i][j] = Integer.parseInt(ss[j]);
				}
			}
			
			int max = 0;
			for (int i = 0; i < matrix.length; i++) {
				
					int result = 0;
					int j = 0;
					// left to right; up to 20
					int ind = j;
					while(ind < 17) {
						result = matrix[i][ind] * matrix[i][ind + 1] * matrix[i][ind + 2] * matrix[i][ind + 3];
						max = Math.max(max, result);
						ind++;
					}
					
					// diagonal
					ind = j;
					while(ind < 17 && (i + 3) < 20) {
						result = matrix[i][ind] * matrix[i + 1][ind + 1] * matrix[i + 2][ind + 2] * matrix[i + 3][ind + 3];
						max = Math.max(max, result);
						ind++;
					}
					
					// reverse diagonal
					ind = j;
					while(ind < 17 && (i - 3) >= 0) {
						result = matrix[i][ind] * matrix[i - 1][ind + 1] * matrix[i - 2][ind + 2] * matrix[i - 3][ind + 3];
						max = Math.max(max, result);
						ind++;
					}										
					
					// up to bottom
					ind = j;
					while(ind < 17) {
						result = matrix[ind][i] * matrix[ind + 1][i] * matrix[ind + 2][i] * matrix[ind + 3][i];
						max = Math.max(max, result);
						ind++;
					}
					
					System.out.println(max);
					max = Math.max(max, result);
				}			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			br.close();	
		}
		
	}
}
