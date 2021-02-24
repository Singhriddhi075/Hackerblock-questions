package hackerblock;

import java.util.Scanner;

public class increasingdecresingse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int p=1000000000;
		while(n>0) {
			int s=scn.nextInt();
			if(s>=p) {
				p=s;
				n--;
				break;
			}
			p=s;
			n--;
		}
		int flag=0;
		while(n>0) {
			int s=scn.nextInt();
			if(s<=p) {
				flag=1;
			    break;
			}
			p=s;
			n--;
		}
		if(flag==0&&n==0)
			System.out.println("true");
		else {
			System.out.println("false");
		}
	}

}
