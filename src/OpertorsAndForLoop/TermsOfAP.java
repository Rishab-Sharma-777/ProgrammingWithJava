package OpertorsAndForLoop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int k=0,n=1,count=0;
		while(n<=1000 && count<x){
			k=3*n+2;
			if(k%4!=0){
			System.out.print(k+" ");
			count++;
			}
			n++;


		}

	}

}
