package hackerblock;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] array=new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=obj.nextInt();
			}
			
			int[] left=new int[n];
			int[] right=new int[n];
			
			left[0]=array[0];
			for(int i=1;i<n;i++)
			{
				left[i]=Math.max(left[i-1],array[i]);
			}
			
			right[n-1]=array[n-1];
			for(int i=n-2;i>=0;i--)
			{
				right[i]=Math.max(right[i+1],array[i]);
			}
			
			int contribution=0;
			for(int i=0;i<n;i++)
			{
				contribution+=Math.min(left[i],right[i])-array[i];
			}
			
			int a=contribution;
			System.out.println(a);
			System.out.println('\t');
		}

	}

}
