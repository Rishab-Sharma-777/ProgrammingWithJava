package Patterns2;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for (int i=1;i<=jj;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int r=1;r<=jj;r++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
