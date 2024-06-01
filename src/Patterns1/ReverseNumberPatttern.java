package Patterns1;

import java.util.Scanner;

public class ReverseNumberPatttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int start=i;
			while(j<=i) {
				System.out.print(start);
				start--;
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
