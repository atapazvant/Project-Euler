package project.euler.solutions;

public class P8 {
	public static void main(String[] args) {
	 String p = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";

	long largest = 0;
	long numm = 0;
	
	for (int i = 0; i < p.length() - 12; i++) {
		String s1 = p.substring(i, i + 1);
		String s2 = p.substring(i + 1, i + 2);
		String s3 = p.substring(i + 2, i + 3);
		String s4 = p.substring(i + 3, i + 4);
		String s5 = p.substring(i + 4, i + 5);
		String s6 = p.substring(i + 5, i + 6);
		String s7 = p.substring(i + 6, i + 7);
		String s8 = p.substring(i + 7, i + 8);
		String s9 = p.substring(i + 8, i + 9);
		String s10 = p.substring(i + 9, i + 10);
		String s11 = p.substring(i + 10, i + 11);
		String s12 = p.substring(i + 11, i + 12);
		String s13 = p.substring(i + 12, i + 13);
		
		numm = Long.parseLong(s1)*
				Long.parseLong(s2)*
				Long.parseLong(s3)*
				Long.parseLong(s4)*
				Long.parseLong(s5)*
				Long.parseLong(s6)*
				Long.parseLong(s7)*
				Long.parseLong(s8)*
				Long.parseLong(s9)*
				Long.parseLong(s10)*
				Long.parseLong(s11)*
				Long.parseLong(s12)*
				Long.parseLong(s13);
	   if (numm > largest) {
	      largest = numm;
	   		}
		}
		System.out.println(largest);
	}	
}
