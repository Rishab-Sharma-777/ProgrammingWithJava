package Patterns1;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		char start=(char)('A'+i+n-2);
		while(i<=n) {
			int j=1;
			char linechange=start;
			while(j<=i) {
				System.out.print(linechange);
				linechange++;
				j++;
			}
			start--;
			i++;
			System.out.println();
		}

	}

}
