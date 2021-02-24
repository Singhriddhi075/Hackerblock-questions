package hackerblock;

import java.util.Scanner;

public class lowerupper {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		char ch=obj.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println("UPPERCASE");
		else if(ch>='a' && ch<='z')
			System.out.println("lowercase");
		else
			System.out.println("Invalid");

	}

}
