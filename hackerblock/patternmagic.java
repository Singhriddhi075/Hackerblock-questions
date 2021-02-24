package hackerblock;

import java.util.Scanner;

public class patternmagic {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int row=2;
        int nst=n-1;
        int nsp=1;

        for(int i=0;i<(2*n)-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    
        
        while(row<=(2*n)-2)
        {
            int cst=1;

            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }

            int csp=1;
            while(csp<=nsp)
            {
                System.out.print(" ");
                csp++;
            }

            cst=1;

            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }
            
            if(row<n)
            {
                nst--;
                nsp+=2;
            }
            else
            {
                nst++;
                nsp-=2;
            }

            System.out.println();
            row++;

        }

        for(int i=0;i<(2*n)-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        

	}

}
