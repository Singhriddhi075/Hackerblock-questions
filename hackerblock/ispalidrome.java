package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class ispalidrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		String s = scn.next();
		int[][] strg = new int[s.length()][s.length()];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		palidromeSS(s);

	}
	public static void palidromeSS(String str) {
		int count=0;
		int l=str.length();
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<=l;j++) {
				String t=str.substring(i,j);
				if(ispalidrome(t))
					count++;
			}
		}
		System.out.println(count);
	}
	public static boolean ispalidrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left <= right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
