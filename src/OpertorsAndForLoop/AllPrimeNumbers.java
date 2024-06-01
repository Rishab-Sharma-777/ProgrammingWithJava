package OpertorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x, y, flg;
        for (x = 2; x <= N; x++) {
            flg = 1;
 
            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.println(x + " ");
        }		

	}

}
