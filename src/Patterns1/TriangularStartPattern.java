package Patterns1;

import java.util.Scanner;

public class TriangularStartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
