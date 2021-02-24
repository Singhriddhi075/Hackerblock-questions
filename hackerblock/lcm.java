package hackerblock;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		   Scanner obj=new Scanner(System.in);
			int n1=obj.nextInt();
			int n2=obj.nextInt();
			int x;
			int ans=0;
			if(n1>n2)
			{
				x=n1;
			}
			
			else
			{
				x=n2;
			}
			
			while(ans==0)
			{
				if(x%n1==0 && x%n2==0)
				{
					ans=x;
				}
				x++;
			}
			System.out.println(ans);
	    }

	}


