package Patterns1;

import java.util.Scanner;

public class ReverseCharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		char start=(char)('A'+n-1);
		while(i<=n) {
			int j=1;
			char linechange=start;
			while(j<=i) {
				System.out.print(linechange);
				linechange--;
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
