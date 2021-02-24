package hackerblock;

import java.util.Scanner;

public class fibonacieenth {
	
	public static void main(String[] args) {
		   int a=0;
			int b=1;
			int c;
			Scanner obj=new Scanner(System.in);
			int x=obj.nextInt();
			int i=0;
			while(i<x)
			{
				c=a+b;
				a=b;
				b=c;
				i++;
				if(i==x)
				{
					System.out.println(a);
				}
			}

		
	}
}
