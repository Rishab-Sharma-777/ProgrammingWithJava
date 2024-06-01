package Patterns2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        int p=inp.nextInt();

        for (int i=1;i<=p;i++) {
            int n=2;
            System.out.print(1);
            for (int k=1;k<i;k++){
                System.out.print("+"+n);
                n++;
            }

            int sum = (i * i + i) / 2;
            System.out.println("="+sum);
        }
	}

}
