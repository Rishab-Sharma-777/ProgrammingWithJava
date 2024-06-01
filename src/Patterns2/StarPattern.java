package Patterns2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<i){
				System.out.print("*");
				k++;
			}

			i++;
			System.out.println();
		}
		
	}
	}

