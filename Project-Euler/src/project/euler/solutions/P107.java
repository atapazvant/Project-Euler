package project.euler.solutions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P107 {

	private static final String path = "File//p107.txt";
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(path)));		
		int count = 40;		
		List<Edge> edges = new ArrayList<Edge>();
		
		int sum = 0;
		int diagonal = 0;
		for (int i = 0; i < count; i++) {
			String[] edgeWeights = reader.readLine().split(",");
			for (int j = 0; j <= diagonal; j++) {
				if(edgeWeights[j].equals("-"))
				{
					continue;
				}
				else 
				{
					sum += Integer.parseInt(edgeWeights[j]);
					edges.add(new Edge(i, j, Integer.parseInt(edgeWeights[j])));
				}				
			}
			diagonal++;
		}		
		Collections.sort(edges);
		
		DisjointSet dSet = new DisjointSet(count);		
		int k = 0;
		int mst = 0;
		while (dSet.isSpanned() == false) {
			if(dSet.find(edges.get(k).from) != dSet.find(edges.get(k).to))
			{
				dSet.Union(edges.get(k).from, edges.get(k).to);
				mst += edges.get(k).weight;
			}
			k++;
		}
			
		
		System.out.println(String.format("MST : %s - Total Sum: %s", mst, sum));
		System.out.println("Answer: " + (sum - mst));
				
		reader.close();
	}
	
	static class Edge implements Comparable<Edge>
	{
		private int to, from, weight;
		
		/**
		 * @param to
		 * @param from
		 * @param weight
		 */
		public Edge(int to, int from, int weight) {
			this.to = to;
			this.from = from;
			this.weight = weight;
		}
		
		/**
		 * @return the to
		 */
		public int getTo() {
			return to;
		}

		/**
		 * @return the from
		 */
		public int getFrom() {
			return from;
		}

		/**
		 * @return the weight
		 */
		public int getWeight() {
			return weight;
		}

		public int compareTo(Edge o) {
			if(this.weight > o.weight)
				return 1;
			else if(this.weight < o.weight)
				return -1;
			else
				return 0;
		}		
	}
		
	
	static class DisjointSet {
		int[] parent;
		int count;
		
		public DisjointSet(int count) {
			this.count = count;
			parent = new int[count];
			for (int i = 0; i < count; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int i) {
			if(parent[i] == i)
				return i;
			else {
				parent[i] = find(parent[i]);
				return parent[i];
			}
		}
		
		public void Union(int i, int j) {			
			int pI = find(i);
			int pJ = find(j);
			// put under pI
			this.parent[pJ] = pI;			
		}
		
		public boolean isSpanned() {
			for (int i = 1; i < count; i++) {
				if(find(0) != find(i))
					return false;
			}
			return true;
		}
	}
}
