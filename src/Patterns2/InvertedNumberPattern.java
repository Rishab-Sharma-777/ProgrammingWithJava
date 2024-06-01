package Patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int p=n;
		while(i<=n){
			int j=1;
			while(j<=n+1-i){
				System.out.print(p);
				j++;
			}
			p--;
			i++;
			System.out.println();
		}

	}

}
