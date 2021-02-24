package hackerblock;

import java.util.Scanner;

public class frombiggestno {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int T=scn.nextInt();
		for(int t=1;t<=T;t++) {
			int n=scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
				
				
			}
			arrange(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		

	}
	public static void arrange(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int max_index=i;
			for(int j=0;j<arr.length-1-i;j++) {
				String s1=arr[j]+""+arr[j+1];
				String s2=arr[j+1]+""+arr[j];
				long s=Long.valueOf(s1);
				long t=Long.valueOf(s2);
				if(t>s) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	

}
