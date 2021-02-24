package hackerblock;

import java.util.Scanner;

public class chessboard {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans = chessboardProblem(0, 0, n-1, n-1, "");
        System.out.println();
        System.out.println(ans);

	}
	public static int chessboardProblem(int cr, int cc, int er, int ec, String ans) {
        if (cc == ec && cr == er) {
            System.out.print(ans + "{" + cr + "-" + cc + "} ");
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }
        
        int count = 0;
        // Moves of knight
        count += chessboardProblem(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}" + "K");
        count += chessboardProblem(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}" + "K");
        // Moves of Rook
        if(cr==er || cr==0 || cc==ec || cc==0)
		{
			for(int i=1;cc+i<=er;i++)
			    count+=chessboardProblem(cr, cc+i,er,ec, ans+"{"+cr+"-"+cc+"}R");

            for(int i=1;cr+i<=er;i++)
			    count+=chessboardProblem(cr+i, cc,er,ec, ans+"{"+cr+"-"+cc+"}R");
		}

        // Moves of Bishop
        if (cr == cc || cr+cc==er) {
            for (int i = 1; i <= er; i++)
                count += chessboardProblem(cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}" + "B");
        }
        return count;
    }

}
