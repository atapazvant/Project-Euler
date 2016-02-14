package project.euler.solutions;

public class P85 {

	public int TW0_MILLION = 2000000;
	public static void main(String[] args) {
		new P85().solve();
	}

	private int solve() {
		int area = 1;
		int width = 0, height = 0;
		int max = Integer.MAX_VALUE;
		int root = (int)Math.sqrt(2000000);
		for (int w = 0; w < root; w++) {
			for (int h = 0; h < root; h++) {
				int diff = Math.abs(calculateNumberOfRectangles(w, h) - TW0_MILLION);
				if(diff < max) {
					max = diff;
					area = w * h;
					width = w;
					height = h;
				}
			}
		}
		System.out.println(width + ", " + height + ", " + area);
		System.out.println(area);
		return area;
	}
	
	public int calculateNumberOfRectangles(int m, int n) {
		return (m + 1) * m * (n + 1) * n / 4;
	}

}
